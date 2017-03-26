package com.arctro.inputvalidator.converter;

public class FloatConverter implements Converter<Float> {
	@Override
	public Float convert(Object o){
		if(o instanceof Number){
			return ((Number)o).floatValue();
		}else if(o instanceof String){
			return Float.parseFloat((String)o);	
		}
		
		throw new NumberFormatException("The provided object was neither a number or a String");
	}
}
