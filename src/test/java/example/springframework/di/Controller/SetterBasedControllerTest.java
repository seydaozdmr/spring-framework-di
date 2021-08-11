package example.springframework.di.Controller;

import example.springframework.di.Service.GreetingService;
import example.springframework.di.Service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {

    SetterBasedController setterBasedController;
    GreetingService greetingService;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterBasedController();
        greetingService=new GreetingServiceImpl();
        setterBasedController.setGreetingService(greetingService);
    }

    @Test
    void getGreeting() {
        System.out.println(setterBasedController.getGreeting());
    }
}