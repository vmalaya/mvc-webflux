package com;

import com.user.User;
import com.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserHandler {

//    private final UserRepository userRepository;
    private final DatabaseClient client;

//    @Transactional
    public Mono<ServerResponse> getAll(ServerRequest request) {
//        return ServerResponse.ok().body(userRepository.findAll(), User.class);
//        userRepository.findById(1L).subscribe( u -> System.out.println(u) );
        return ServerResponse.ok().body(client.execute("select id, username from user").as(User.class).fetch().all(), User.class);
    }
}
