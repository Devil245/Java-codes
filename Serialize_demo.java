package com.atos.java.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Serialize_demo {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("Employee.txt");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("Raj");
		os.writeObject(e);
		os.flush();
		os.close();
		
		FileInputStream fs=new FileInputStream("Employee.txt");
		ObjectInputStream oi=new ObjectInputStream(fs);
		Employee e1=(Employee)oi.readObject();
		System.out.println("Employee id "+e1.getEid());
		System.out.println("Employee name is "+e1.getEname());
		Date d=new Date();
		System.out.println(d);
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTimeInMillis());
		oi.close();

	}

}
