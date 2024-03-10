package com.lorby.controller;

import com.lorby.payload.ApiResult;
import com.lorby.payload.UserDTO;
import com.lorby.payload.UserResDTO;
import com.lorby.utils.AppConstants;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(IUserController.BASE_PATH_FOR_REGISTRATION)
public interface IUserController {

String BASE_PATH_FOR_REGISTRATION = AppConstants.BASE_PATH_FOR_ALL_PR + "/register";

@PostMapping(path = BASE_PATH_FOR_REGISTRATION)
UserResDTO register(@Valid @RequestBody UserDTO userDTO);


}
