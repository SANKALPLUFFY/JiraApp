package com.example.core.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Service
public class Sum {
	private int sum;

	public int sumOfNumbers(int one, int two)
	{
		sum=one+two;
		return sum;
	}
}
