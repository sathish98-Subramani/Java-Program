package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SnapDragon implements Processor{

    @Override
    public void process(){
        System.out.println("I Am World Second Most Used Processor");
    }
}
