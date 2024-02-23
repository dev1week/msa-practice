package com.exmaple.userservice.service;


import com.exmaple.userservice.dto.UserDto;
import org.springframework.stereotype.Service;

@Service

public interface UserService {
    UserDto createUser(UserDto userDto);

}
