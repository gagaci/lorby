package com.lorby.service;

import com.lorby.payload.UserDTO;
import com.lorby.payload.UserResDTO;

public interface IUserService {

    UserResDTO register(UserDTO userDTO);
    UserResDTO login(UserDTO userDTO);

}
