package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example")
@PropertySource("classpath:/application.properties")
public class App {


    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        Samsung samsung=context.getBean(Samsung.class);
        samsung.config();

    }
}
