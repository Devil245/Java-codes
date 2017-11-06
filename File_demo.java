package com.atos.java.file;

import java.io.FileInputStream;
import java.io.IOException;

public class File_demo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs= new FileInputStream("messages.properties");
		int n=fs.available();
		for(int i=0;i<n;i++)
		{
			System.out.print((char)fs.read());
		}
		fs.close();

	}

}
