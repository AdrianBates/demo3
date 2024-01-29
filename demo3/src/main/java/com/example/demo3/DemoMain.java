package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo3.calculator.Calculator;


@Component
public class DemoMain implements CommandLineRunner {

	private final Calculator calculator;

	@Autowired
	DemoMain(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(calculator.add(1, 2));
	}
}


