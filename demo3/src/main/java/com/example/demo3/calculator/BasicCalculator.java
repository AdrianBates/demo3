package com.example.demo3.calculator;

import org.springframework.stereotype.Component;

@Component
public class BasicCalculator implements Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
