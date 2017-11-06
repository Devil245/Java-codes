package com.atos.java.exception;
import java.util.Scanner;
public class User_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Name ");
		String name=sc.next();
		System.out.println("Age ");
		int age=sc.nextInt();
		
			
			if(age>100)
			{
				try{
					throw new Age_valid_constructor("Invalid age");
				}
				catch(Age_valid_constructor a)
				{
					System.out.println(a.getMessage());
				}
			}
			else
			{
				System.out.println("Valid age");
			}
		
		
sc.close();
	}

}
