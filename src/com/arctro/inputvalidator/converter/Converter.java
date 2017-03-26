package com.arctro.inputvalidator.converter;

/**
 * Converts a passed in object to a number
 * @author Ben McLean
 *
 * @param <T> The number to convert to
 */
public interface Converter<T> {
	/**
	 * Converts an object to T
	 * @param o The object to convert
	 * @return The conversion result
	 */
	public T convert(Object o);
}
