package edu.springguru.dicommon;

import edu.springguru.dicommon.controllers.ConstructorInjectedController;
import edu.springguru.dicommon.controllers.MyController;
import edu.springguru.dicommon.controllers.PropertyInjectedController;
import edu.springguru.dicommon.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiCommonApplication {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(DiCommonApplication.class, args);
        final MyController myController = (MyController)ctx.getBean("myController");
        myController.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
