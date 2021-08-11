package example.springframework.di.Service.I18NService;

import example.springframework.di.Service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishService implements GreetingService {
    @Override
    public String sayHallo() {
        return "Hello Wordl - EN";
    }
}
