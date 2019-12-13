package com.user;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends R2dbcRepository<User, Long> {

//    @Query("select id, username from user u where u.username = :username")
//    Flux<User> findByUsername(String username);
//
//    @Query("delete from user")
//    Flux<User> deleteUser();
 }
