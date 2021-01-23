package webflux.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import webflux.entity.User;

public interface UserService {
    Mono<User> getUserById(int id);
    Flux<User> getAllUser();
    Mono<Void> saveUserInfo(Mono<User> user);
}
