package ccyy.testdemo;

import ccyy.User;
import ccyy.config.springConfig;
import ccyy.jdbct.BookService;
import ccyy.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.applet.AppletContext;

public class Testing {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user  = context.getBean("user",User.class);

        user.display();
    }

    @Test
    public void test3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        userService.user.display();
    }
    @Test
    public void jdbctest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        System.out.println(bookService.findCount());
    }
}
