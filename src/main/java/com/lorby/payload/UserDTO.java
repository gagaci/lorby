package com.lorby.payload;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    @NotBlank
    private String email;
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
}
