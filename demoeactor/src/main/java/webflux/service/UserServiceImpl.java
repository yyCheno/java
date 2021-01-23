package webflux.service;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import webflux.entity.User;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserServiceImpl implements  UserService{

    private final Map<Integer,User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1,new User("lucy","man",20));
        this.users.put(1,new User("lcy","ma",23));
        this.users.put(1,new User("cy","man",240));
    }

    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {

        return userMono.doOnNext(person->{
            int id = users.size()+1;
            users.put(id,person);
        }).thenEmpty(Mono.empty());
    }
}
