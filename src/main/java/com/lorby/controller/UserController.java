package com.lorby.controller;

import com.lorby.payload.ApiResult;
import com.lorby.payload.UserDTO;
import com.lorby.payload.UserResDTO;
import com.lorby.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
public class UserController implements IUserController {

    private final IUserService userService;

    @Override
    public ApiResult<UserResDTO> register(UserDTO userDTO) {
        return userService.register(userDTO);
    }
}
