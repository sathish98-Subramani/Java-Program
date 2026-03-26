package com.corejava.di.spellchecker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication 
{
    public static void main(String[] args )
    {
//        ApplicationContext context=
//                new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);

//        EmailClient emailClient= new EmailClient(new BasicSpellChecker());
//        emailClient.sendEmail("Hey, "+"This is my first email message");
//        emailClient.sendEmail("Hey, "+"This is my second email message");
        EmailClient emailClient=
                context.getBean("emailClient", EmailClient.class);
        emailClient.sendEmail("Hi Everyone");

        ((AbstractApplicationContext) context).registerShutdownHook();

    }
}

