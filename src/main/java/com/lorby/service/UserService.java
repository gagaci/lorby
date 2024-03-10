package com.lorby.service;

import com.lorby.exception.AppException;
import com.lorby.payload.UserDTO;
import com.lorby.payload.UserResDTO;
import com.lorby.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;


    @Override
    public UserResDTO register(UserDTO userDTO) {
        checkUser(userDTO);
    }


    @Override
    public UserResDTO login(UserDTO userDTO) {
        return null;
    }

    private void checkUser(UserDTO userDTO) {
        if (Objects.isNull(userDTO)) throw AppException.appThrow("User is null");

        if (userDTO.getUserName().isEmpty() || userDTO.getUserName().isBlank())
            throw AppException.appThrow("user name is empty");
        if (userDTO.getEmail().isEmpty() || userDTO.getEmail().isBlank())
            throw AppException.appThrow("email is empty");
        if (userDTO.getPassword().isEmpty() || userDTO.getPassword().isBlank())
            throw AppException.appThrow("password is empty");


    }


}
