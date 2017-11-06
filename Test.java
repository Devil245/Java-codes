package com.atos.java.exception;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int data=50/2;
		
		}
		catch(Exception e)
		{
			System.out.println("Cannot divide by zero");
		}
		finally
		{
			System.out.println("Hey");
		}

	}

}
