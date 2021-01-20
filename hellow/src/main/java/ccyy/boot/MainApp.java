package ccyy.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {


        ConfigurableApplicationContext run = SpringApplication.run(MainApp.class,args);
        String[] names = run.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }
}
