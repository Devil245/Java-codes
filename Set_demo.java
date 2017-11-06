package com.atos.java.collections;

import java.util.*;

public class Set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<Integer>();
		s.add(22);
		s.add(29);
		s.add(34);
		s.add(33);
		s.add(22);
		System.out.println(s);
		System.out.println(s.contains(12));
		System.out.println(s.contains(22));
		

	}

}
