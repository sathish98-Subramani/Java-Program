package com.corejava.di.spellchecker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.corejava.di.spellchecker")
public class AppConfig {

//    @Bean(name = "basic")
//    public BasicSpellChecker getBasicSpellChecker(){
//        return new BasicSpellChecker();
//    }
//
//    @Bean(name = "advance")
//    public AdvancedSpellChecker getAdvancedSpellChecker(){
//        return new AdvancedSpellChecker();
//    }
//
//    @Bean(name = "EmailClient")
//    public EmailClient getEmailClient(){
//        return new EmailClient(getBasicSpellChecker());
//    }

}
