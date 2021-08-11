package example.springframework.di.Controller;

import example.springframework.di.Service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructerInjectedController {
    private GreetingService greetingService;


    public ConstructerInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayHallo();
    }
}
