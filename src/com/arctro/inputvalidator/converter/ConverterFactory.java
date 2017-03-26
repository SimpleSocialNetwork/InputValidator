package com.arctro.inputvalidator.converter;

import java.util.HashMap;

public class ConverterFactory {
	
	private static HashMap<Class<?>, Converter<?>> registered;
	static{
		registered = new HashMap<Class<?>, Converter<?>>();
		registered.put(Integer.class, new IntegerConverter());
		registered.put(Float.class, new FloatConverter());
		registered.put(Double.class, new DoubleConverter());
		registered.put(Long.class, new LongConverter());
		registered.put(Byte.class, new ByteConverter());
	}
	
	public static void register(Class<?> c, Converter<?> nc){
		registered.put(c, nc);
	}
	
	public static void deregister(Class<?> c){
		registered.remove(c);
	}
	
	public static Converter<?> get(Class<?> c){
		return registered.get(c);
	}
}
