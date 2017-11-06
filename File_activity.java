package com.atos.java.file;

import java.io.File;
import java.io.IOException;

public class File_activity {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File file=new File("D:/test.txt");
		//file.createNewFile();
		
		//File file=new File("D:/test.txt");
		//file.mkdir();
		
		File file=new File("D:/test","my.txt");
		file.createNewFile();

	}

}
