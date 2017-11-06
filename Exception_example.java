package com.atos.java.exception;
import java.util.Scanner;
public class Exception_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[4];
		System.out.println("Enter elements :");
		for(int i=0;i<4;i++)
		{
			

			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
			
		}
		sc.close();

	}

}
