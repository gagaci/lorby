package com.lorby.controller;

import com.lorby.payload.ApiResult;
import com.lorby.payload.UserDTO;
import com.lorby.payload.UserResDTO;
import com.lorby.utils.AppConstants;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(IUserController.BASE_PATH_FOR_USER_CONT)
public interface IUserController {

String BASE_PATH_FOR_USER_CONT = AppConstants.BASE_PATH_FOR_ALL_PR + "/user";

String BASE_PATH_FOR_USER_REG = "/register";

@PostMapping(path = BASE_PATH_FOR_USER_REG)
ApiResult<UserResDTO> register(@Valid @RequestBody UserDTO userDTO);


}
