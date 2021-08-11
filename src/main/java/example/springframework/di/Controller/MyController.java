package example.springframework.di.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello world");
        return "hello folks";
    }


}
