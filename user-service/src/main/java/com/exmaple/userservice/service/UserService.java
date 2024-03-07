package com.exmaple.userservice.service;


import com.exmaple.userservice.dto.UserDto;
import com.exmaple.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();


    UserDto getUserDetailsByEmail(String userName);

}
