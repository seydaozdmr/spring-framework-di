package example.springframework.di;

import example.springframework.di.Controller.*;
import example.springframework.di.Controller.I18N.I18nController;
import example.springframework.di.Controller.PetController.PetController;
import example.springframework.di.DependencyManager.DependencyContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DiApplication.class, args);
		//retrieve from Spring Context
		MyController controller=(MyController) ctx.getBean("myController");
		


		controller.sayHello();

		DependencyController dependencyController=new DependencyController();
		MyController controller1=(MyController) dependencyController.getBean("MyController");
		MyController myController=new MyController();
		//System.out.println(myController.getClass().getSimpleName());
		controller1.sayHello();

		System.out.println("***Property Injection");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("***Setter Injection");
		SetterBasedController setterBasedController=(SetterBasedController) ctx.getBean("setterBasedController");
		System.out.println(setterBasedController.getGreeting());

		System.out.println("***Constructor Injection");
		ConstructerInjectedController constructerInjectedController=(ConstructerInjectedController) ctx.getBean("constructerInjectedController");
		System.out.println(constructerInjectedController.getGreeting());

		System.out.println("***I18n Controller");
		I18nController i18nController=(I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		System.out.println("****Pet Controller");
		PetController petController=(PetController) ctx.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());
	}

}
