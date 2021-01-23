package ccyy;

import org.springframework.stereotype.Controller;

@Controller
public class User {
    private String names ;

    public User() {
    }

    public void add(){
        System.out.println("add...");
    }
    public void display(){
        System.out.println("names:"+names);
    }
    public void setNames(String string) {
        this.names = string;
    }
}
