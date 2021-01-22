package ccyy.testdemo;

import ccyy.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.applet.AppletContext;

public class Testing {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user  = context.getBean("user",User.class);
        user.add();
    }
}
