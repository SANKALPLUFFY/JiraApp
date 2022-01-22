package com.example.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.core.sum.SumOfNumbers;

@Service
public class AdditionServiceImpl implements AdditionService 
{
	@Autowired
	private SumOfNumbers numbers;

	public int getNumbers(int one,int two) {
		int sum=one+two;
		return sum;
	}

	public void setNumbers(SumOfNumbers numbers) {
		this.numbers = numbers;
	}
}
