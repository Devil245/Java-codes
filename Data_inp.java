package com.atos.java.file;
import java.io.*;
public class Data_inp {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter your name");
		String x=d.readLine();
		System.out.println("Enter age ");
		int y=Integer.parseInt(d.readLine());
		System.out.println("Name : "+x);
		System.out.println("Age : "+y);
		d.close();

	}

}
