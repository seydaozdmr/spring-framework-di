package example.springframework.di.Service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    /**
     * ConstuctorGreetingService and GreetingServiceImpl both implements GreetingService
     * Spring doesn't know which is use for injecting dependency
     * We qualify which one GreetingService we want to use on Controller class.
     */

    @Override
    public String sayHallo() {
        return "Constructor Hello World";
    }
}
