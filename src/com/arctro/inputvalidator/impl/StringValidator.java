package com.arctro.inputvalidator.impl;

import com.arctro.inputvalidator.Validator;

/**
 * A concrete implementation of Validator that checks if a String matches a regex
 * @author Ben McLean
 *
 */
public class StringValidator implements Validator<String>{
	
	String regex;
	
	public StringValidator(String regex){
		this.regex = regex;
	}
	
	@Override
	public boolean isValid(String input) {
		return input.matches(regex);
	}
	
}
