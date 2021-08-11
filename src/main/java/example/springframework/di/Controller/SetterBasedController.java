package example.springframework.di.Controller;

import example.springframework.di.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//using this annotation we inverse dependency to framework
@Controller
public class SetterBasedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService (GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){
        return greetingService.sayHallo();
    }
}
