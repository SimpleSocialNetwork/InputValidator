package com.arctro.inputvalidator.impl;

import com.arctro.inputvalidator.Validator;

/**
 * A concrete implementation of Validator that checks if a number is within a range
 * @author Ben McLean
 *
 * @param <T> The number to check
 */
public class SimpleNumberValidator<T extends Number> implements Validator<T>{
	
	double moreThan;
	double lessThan;
	
	public SimpleNumberValidator(double moreThan, double lessThan) {
		super();
		this.moreThan = moreThan;
		this.lessThan = lessThan;
	}

	@Override
	public boolean isValid(T input) {
		Number n = (Number) input;
		return n.doubleValue() > moreThan && n.doubleValue() < lessThan;
	}
	
	
	
}
