package example.springframework.di.Service.I18NService;

import example.springframework.di.Service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("ES")
@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishService implements GreetingService {
    @Override
    public String sayHallo() {
        return "Hola Mundo - ES";
    }
}
