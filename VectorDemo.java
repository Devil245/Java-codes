package com.atos.java.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(30);
		v.add(93);
		v.add(74);
		v.add(91);
		v.add(85);
		v.remove(3);
		System.out.println(v);

	}

}
