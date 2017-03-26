package com.arctro.inputvalidator.converter;

public class LongConverter implements Converter<Long> {
	@Override
	public Long convert(Object o){
		if(o instanceof Number){
			return ((Number)o).longValue();
		}else if(o instanceof String){
			return Long.parseLong((String)o);	
		}
		
		throw new NumberFormatException("The provided object was neither a number or a String");
	}
}
