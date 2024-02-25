package com.exmaple.userservice.jpa;


import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {


    UserEntity findByUserId(String userId);

    Optional<UserEntity> findByEmail(String email);
}
