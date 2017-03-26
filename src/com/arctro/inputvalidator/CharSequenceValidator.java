package com.arctro.inputvalidator;

public abstract class CharSequenceValidator<T extends CharSequence> implements Validator<T>{
	
	private Class<T> typeParameterClass;
	
	public CharSequenceValidator(Class<T> typeParameterClass){
		this.typeParameterClass = typeParameterClass;
	}
	
	public boolean isCharSequence(Object o){
		return o instanceof CharSequence;
	}
}
