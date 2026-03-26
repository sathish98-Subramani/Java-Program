package com.corejava.di.spellchecker;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasicSpellChecker implements SpellChecker {

	public BasicSpellChecker(){
		System.out.println("BasicSpellChecker");
	}

	@Override
	public void checkSpelling(String emailMessage) {
		if(emailMessage!=null)
		{
			System.out.println("Checking Spelling using Basic Spell Checker...");
            System.out.println("Spell Checking Completed!!");
		}
		else {
			throw new RuntimeException("An exception occured "+"while checking Spelling");
		}
	}

}
