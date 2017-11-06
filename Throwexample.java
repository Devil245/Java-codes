package com.atos.java.exception;

public class Throwexample {
	
	public double divide(int dividend,int divisor)throws ArithmeticException{
		if(divisor==0)
		{
			throw new ArithmeticException("Divide / 0 thrown");
		}
		return dividend/divisor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwexample t= new Throwexample();
		double d=t.divide(4, 0);
		System.out.println(d);
		

	}

}
