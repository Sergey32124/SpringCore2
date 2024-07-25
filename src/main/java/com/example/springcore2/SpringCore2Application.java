package com.example.springcore2;

import com.example.springcore2.emity.Auto;
import com.example.springcore2.emity.Engine;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCore2Application {

    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        Auto auto=context.getBean("auto", Auto.class);
        Auto auto2=context.getBean("auto2", Auto.class);
        Auto auto3=context.getBean("auto3", Auto.class);
        System.out.println(auto);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println("------------------------------------------------------------");
        Engine engine=context.getBean("engine", Engine.class);
        Engine engine2=context.getBean("engine2", Engine.class);
        Engine engine3=context.getBean("engine3", Engine.class);
        System.out.println(engine);
        System.out.println(engine2);
        System.out.println(engine3);
    }

}
