package com.atos.java.exception;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a+b>50)
		{
			try{
				throw new Sum_valid("Sum exceeds");
			}
			catch(Sum_valid c)
			{
				System.out.println(c.getMessage());
			}
		}
		else
			System.out.println("Sum : "+(a+b));
		sc.close();
	}
	

}
