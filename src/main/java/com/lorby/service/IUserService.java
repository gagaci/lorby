package com.lorby.service;

import com.lorby.payload.ApiResult;
import com.lorby.payload.UserDTO;
import com.lorby.payload.UserResDTO;

public interface IUserService {

    ApiResult<UserResDTO> register(UserDTO userDTO);
    UserResDTO login(UserDTO userDTO);

}
