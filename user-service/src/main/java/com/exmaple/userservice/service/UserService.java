package com.exmaple.userservice.service;


import com.exmaple.userservice.dto.UserDto;
import com.exmaple.userservice.jpa.UserEntity;
import org.springframework.stereotype.Service;

@Service

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUSerByUserId(String userId);
    Iterable<UserEntity> getUserByAll();

}
