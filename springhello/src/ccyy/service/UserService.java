package ccyy.service;

import ccyy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service(value = "userService")
public class UserService {
    @Autowired
    public User user;

    public UserService() {
    }

    public void add(){
        System.out.println("service add......");
    }
}
