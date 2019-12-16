package com.example.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserHandler {

    private final UserRepository userRepository;

    public Mono<ServerResponse> getAll(ServerRequest request) {
        return ServerResponse.ok().body(userRepository.findAll(),
                                        User.class);
    }
}
