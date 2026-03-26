package com.corejava.di.spellchecker;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailClient /*implements InitializingBean, DisposableBean*/ {
	@Autowired
	private SpellChecker spellChecker;

	public EmailClient(){
		System.out.println("no args constructor");

	}

	public EmailClient(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}
	
	void sendEmail(String emailMessage) {

		spellChecker.checkSpelling(emailMessage);
	}

	public void setSpellChecker(SpellChecker spellChecker){
		System.out.println("setSpellChecker");
		this.spellChecker=spellChecker;
	}

//	public void init(){
//		System.out.println("initializing email client");
//	}
//
//	public void destroy(){
//		System.out.println("destroying email client");
//	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Setting Properties After bean is initialized");
//	}
//
//	@Override
//	public void destroy() throws Exception{
//		System.out.println("Destroyed Properties");
//	}
}
