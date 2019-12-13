//package com;
//
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.client.ClientResponse;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//
//public class UserWebClient {
//    private WebClient client = WebClient.create("http://localhost:8080");
//
//    private Mono<ClientResponse> result = client.get()
//            .uri("/all")
//            .accept(MediaType.APPLICATION_JSON)
//            .exchange();
//
//    public String getResult() {
//        return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
//    }
//}
