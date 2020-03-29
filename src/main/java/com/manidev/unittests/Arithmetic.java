package com.manidev.unittests;

import org.springframework.stereotype.Service;

@Service
public class Arithmetic implements IArithmetic
{
	@Override
	public int Sum(int a, int b)
	{
		return a + b;
	}
	@Override
	public int Subtract(int a, int b)
	{
		return a - b;
	}
	@Override
	public int Multiply(int a, int b)
	{
		return a * b;
	}
	@Override
	public int Divide(int a, int b)
	{
		return a / b;
	}
	@Override
	public int Remainder(int a, int b)
	{
		return a % b;
	}	
}
