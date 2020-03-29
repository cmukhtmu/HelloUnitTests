package com.manidev.unittests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class HelloUnitTestsApplication 
{	
	@Autowired
	IArithmetic arithmetic = new Arithmetic();
	
	public static void main(String[] args) 
	{
		SpringApplication.run(HelloUnitTestsApplication.class, args);
		
		HelloUnitTestsApplication app = new HelloUnitTestsApplication();
		System.out.println("Sum works 10 + 10 = " + app.arithmetic.Sum(10, 10));
	}	
}
