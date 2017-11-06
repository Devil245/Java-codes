package com.atos.java.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereaddemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("em.txt");
		String st="Learning Java is easy";
		char[] c=st.toCharArray();
		for(int i=0;i<c.length;i++)
			f.write(c[i]);
		f.close();
		FileReader fr=new FileReader("em.txt");
		char[] c1=new char[50];
		fr.read(c1);
		for(char x:c1)
			System.out.print(x);
fr.close();
	}

}
