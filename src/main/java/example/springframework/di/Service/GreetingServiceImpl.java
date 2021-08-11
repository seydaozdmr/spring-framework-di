package example.springframework.di.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHallo() {
        return "Hello World";
    }
}
