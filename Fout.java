package com.atos.java.file;
import java.io.*;
public class Fout {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String str="This is eexample";
		byte[] b=str.getBytes();
		FileOutputStream fos=new FileOutputStream("zzz.txt");
		for(int i=0;i<b.length;i++)
		{
			fos.write((char) b[i]);
		}
		System.out.println("File successfully written.............");
		fos.close();

	}

}
