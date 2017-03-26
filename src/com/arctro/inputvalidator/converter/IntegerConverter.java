package com.arctro.inputvalidator.converter;

public class IntegerConverter implements Converter<Integer>{
	@Override
	public Integer convert(Object o){
		if(o instanceof Number){
			return ((Number)o).intValue();
		}else if(o instanceof String){
			return Integer.parseInt((String)o);	
		}
		
		throw new NumberFormatException("The provided object was neither a number or a String");
	}

}
