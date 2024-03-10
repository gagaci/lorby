package com.lorby.service;

import com.lorby.entity.User;
import com.lorby.exception.AppException;
import com.lorby.payload.ApiResult;
import com.lorby.payload.UserDTO;
import com.lorby.payload.UserResDTO;
import com.lorby.payload.UserRestDTOMapper;
import com.lorby.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;

    private final UserRestDTOMapper userRestDTOMapper;


    @Override
    public ApiResult<UserResDTO> register(UserDTO userDTO) {
        checkUser(userDTO);
        User.UserBuilder userBuilder = User.builder()
                .userName(userDTO.getUserName())
                .email(userDTO.getEmail())
                .password(userDTO.getPassword());
        return ApiResult.successResponse(userRestDTOMapper.
                apply(userRepository.save(userBuilder.build())));
    }


    @Override
    public UserResDTO login(UserDTO userDTO) {
        return null;
    }

    private void checkUser(UserDTO userDTO) {
        if (Objects.isNull(userDTO)) throw AppException.appThrow("User is null");
        if (userDTO.getUserName() == null || userDTO.getUserName().isEmpty() || userDTO.getUserName().isBlank())
            throw AppException.appThrow("user name is empty");

        if (userRepository.existsByUserName(userDTO.getUserName()))
            throw AppException.appThrow("user name is already exist");

        if (userDTO.getEmail().isEmpty() || userDTO.getEmail().isBlank())
            throw AppException.appThrow("email is empty");

        if (!userDTO.getEmail().contains("@"))
            throw AppException.appThrow("email is not valid");

        if (userDTO.getPassword().isEmpty() || userDTO.getPassword().isBlank())
            throw AppException.appThrow("password is empty");

        if (!Pattern.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", userDTO.getEmail()))
            throw AppException.appThrow("email is not valid");


    }


}
