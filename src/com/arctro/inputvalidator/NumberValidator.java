package com.arctro.inputvalidator;

import com.arctro.inputvalidator.converter.Converter;
import com.arctro.inputvalidator.converter.ConverterFactory;

public abstract class NumberValidator<T extends Number> implements Validator<T>{
	
	private Class<T> typeParameterClass;
	
	public NumberValidator(Class<T> typeParameterClass){
		this.typeParameterClass = typeParameterClass;
	}
	
	public boolean isNumber(Object o){
		return o instanceof Number;
	}
	
	public T parse(Object o){
		@SuppressWarnings("unchecked")
		Converter<T> nc = (Converter<T>) ConverterFactory.get(typeParameterClass);
		return nc.convert(o);
		
	}
}
