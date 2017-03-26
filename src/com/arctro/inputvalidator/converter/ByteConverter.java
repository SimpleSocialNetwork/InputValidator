package com.arctro.inputvalidator.converter;

public class ByteConverter implements Converter<Byte> {
	@Override
	public Byte convert(Object o){
		if(o instanceof Number){
			return ((Number)o).byteValue();
		}else if(o instanceof String){
			return Byte.parseByte((String)o);	
		}
		
		throw new NumberFormatException("The provided object was neither a number or a String");
	}
}
