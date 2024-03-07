package com.exmaple.userservice.vo;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {


    @NotNull(message="이메일 값이 필요합니다.")
    @Size(min=2, message="이메일은 두 글자보다 길어야 합니다.")
    @Email
    private String email;



    @NotNull(message = "비밀번호 값이 필요합니다.")
    @Size(min=8, message="비밀번호는 8자보다 길어야합니다.")
    private String password;

}
