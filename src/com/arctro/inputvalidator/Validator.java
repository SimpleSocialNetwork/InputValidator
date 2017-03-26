package com.arctro.inputvalidator;

/**
 * Validates an inputted Object
 * @author Ben McLean
 *
 * @param <T> The object to validate
 */
public interface Validator<T> {
	/**
	 * Checks if an object is valid
	 * @param input The object to validate
	 * @return If the object is valid
	 */
	public boolean isValid(Object input);
}
