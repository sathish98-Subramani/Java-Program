package com.corejava.di.spellchecker;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class LifeCycleHooks {

    @PostConstruct
    public void start(){
	System.out.println("initializing email client");
	}

    @PreDestroy
	public void stop(){
		System.out.println("destroying email client");
	}

}
