package com.example;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements Processor{

    @Override
    public void process(){
        System.out.println("I Am Best Processor Ever.");
    }
}
