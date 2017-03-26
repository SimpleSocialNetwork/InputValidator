package com.arctro.inputvalidator.converter;

public class DoubleConverter implements Converter<Double> {
	@Override
	public Double convert(Object o){
		if(o instanceof Number){
			return ((Number)o).doubleValue();
		}else if(o instanceof String){
			return Double.parseDouble((String)o);	
		}
		
		throw new NumberFormatException("The provided object was neither a number or a String");
	}
}
