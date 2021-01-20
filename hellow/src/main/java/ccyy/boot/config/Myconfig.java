package ccyy.boot.config;

import ccyy.boot.bean.Pet;
import ccyy.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)
public class Myconfig {
    @Bean
    public User user01(){
        return new User("zhangsan",18);
    }
    @Bean
    public Pet tomcatpet(){
        return new Pet("tomact");
    }
}
