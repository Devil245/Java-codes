package com.atos.java.file;

import java.io.IOException;
import java.io.PrintWriter;


public class Prinwriteexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter p=new PrintWriter("ABC.txt");
		p.print("Employee detailsd");
		p.println("enmae : Hari");
		p.format("%2$s %1$5d :",123,"Hello");
p.close();
	}

}
