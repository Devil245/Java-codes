package com.atos.java.collections;

import java.util.*;
public class List_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(25);
		lst.add(26);
		lst.add(25);
		lst.add(null);
		lst.add(null);
		lst.add(2,150);
//		for(Integer i:lst)
//			System.out.println(i);
		lst.remove(2);
		System.out.println(lst);
		System.out.println(lst.contains(26));
		System.out.println(lst.contains(20));
		System.out.println(lst.isEmpty());
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(30);
		l.add(20);
		System.out.println(l);
		lst.addAll(l);
		System.out.println(lst);
		lst.removeAll(l);
		System.out.println(lst);
		
		System.out.println(lst.lastIndexOf(null));
		System.out.println(lst.indexOf(null));

	}

}
