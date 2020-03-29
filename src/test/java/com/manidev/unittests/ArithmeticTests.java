package com.manidev.unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ArithmeticTests 
{	
	@Autowired
	IArithmetic arithmetic;
	
	@Test
	void SumTest() 
	{
		int result = 0, expected = 0;
		
		result = arithmetic.Sum(10, 10);
		expected = 20;
		Assert.isTrue(result == expected, "Sum Failed. result: " + result + ", expected: " + expected);
		
		result = arithmetic.Sum(1000000000, 1000000000);
		expected = 2000000000;
		Assert.isTrue(result == expected, "Sum Failed. result: " + result + ", expected: " + expected);
		
		result = arithmetic.Sum(-10, -10);
		expected = -20;
		Assert.isTrue(result == expected, "Sum Failed. result: " + result + ", expected: " + expected);
		
		result = arithmetic.Sum(-1000000000, -1000000000);
		expected = -2000000000;
		Assert.isTrue(result == expected, "Sum Failed. result: " + result + ", expected: " + expected);
		
		result = arithmetic.Sum(0, 0);
		expected = 0;
		Assert.isTrue(result == expected, "Sum Failed. result: " + result + ", expected: " + expected);		
	}
	@Test
	void SubtractTest() 
	{
		int result = 0, expected = 0;
		
		result = arithmetic.Subtract(10, 10);
		Assert.isTrue(result == expected, "Subtract Failed. result: " + result + ", expected: " + expected);
		
		result = arithmetic.Subtract(1000000001, 1000000000);
		expected = 1;
		Assert.isTrue(result == expected, "Subtract Failed. result: " + result + ", expected: " + expected);
		
		result = arithmetic.Subtract(-10, -10);
		expected = 0;
		Assert.isTrue(result == expected, "Subtract Failed. result: " + result + ", expected: " + expected);
		
		result = arithmetic.Subtract(-1000000000, -1000000001);
		expected = 1;
		Assert.isTrue(result == expected, "Subtract Failed. result: " + result + ", expected: " + expected);
		
		result = arithmetic.Subtract(0, 0);
		expected = 0;
		Assert.isTrue(result == expected, "Subtract Failed. result: " + result + ", expected: " + expected);		
	}

}
