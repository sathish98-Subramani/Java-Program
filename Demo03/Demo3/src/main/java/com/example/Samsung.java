package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Value("${my.project}")
    private String display;


    @Autowired
    @Qualifier("mediaTek")
    private Processor processor;

    public Samsung(Processor processor){
        this.processor=processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void config(){
        System.out.println("12GB RAM, 50MP, 5000MaH");
        processor.process();
        System.out.println(display);
    }
}
