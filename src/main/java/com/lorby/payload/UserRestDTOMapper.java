package com.lorby.payload;
import com.lorby.entity.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class UserRestDTOMapper implements Function<User,UserResDTO>{
    @Override
    public UserResDTO apply(User user) {
        return new UserResDTO(user.getId(),user.getUserName(),user.getEmail());
    }
}
