package example.springframework.di.Controller;


import example.springframework.di.DependencyManager.DependencyContext;
import example.springframework.di.DependencyManager.DependencyContextImpl;
import example.springframework.di.Service.GreetingService;
import example.springframework.di.Service.GreetingServiceImpl;

public class DependencyController {
    DependencyContext dependencyContext;

    public DependencyController() {
        this.dependencyContext = new DependencyContextImpl();
        dependencyContext.addBean(new MyController());
        dependencyContext.addBean(new PropertyInjectedController());
        dependencyContext.addBean(new SetterBasedController());
        dependencyContext.addBean(new GreetingServiceImpl());
        dependencyContext.addBean(new ConstructerInjectedController((GreetingService) this.getBean("GreetingServiceImpl")));

    }

    public Object getBean(String name){
        return dependencyContext.getBean(name);
    }
}
