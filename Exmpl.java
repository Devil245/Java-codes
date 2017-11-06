package com.atos.java.exception;
import java.util.*;
public class Exmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		try{
			int a=sc.nextInt();
			System.out.println(45/a);
			int c[]={1};
			c[1]=64;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("/ by zero");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Array size matters");
		}
		System.out.println("Terminating........");
		sc.close();

	}

}
