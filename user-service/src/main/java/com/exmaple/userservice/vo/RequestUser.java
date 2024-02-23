package com.exmaple.userservice.vo;


import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser
{

    @NotNull
    @Size(min=2, message="Email not be less than two characters")
    @Email
    private String email;
    @NotNull
    @Size(min=2, message="Name not be less than two characters")
    private String name;
    @NotNull
    @Size(min=8, message="Password not be less than 8 characters")
    private String pwd;
}
