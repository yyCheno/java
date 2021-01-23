package webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import webflux.entity.User;
import webflux.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Mono<User> getUserID(@PathVariable int id){
        return  userService.getUserById(id);
    }

    @GetMapping("/user/{id}")
    public Flux<User> getUsers(){
        return  userService.getAllUser();
    }
    @PostMapping("/saveuser")
    public Mono<Void> saveUser(@RequestBody User user){
        Mono<User> userMono = Mono.just(user);
        return userService.saveUserInfo(userMono);
    }
}
