package com.atos.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Double> hm=new HashMap<>();
		hm.put(1, new Double(2500.34));
		hm.put(2, new Double(5500.33));
		hm.put(3, new Double(6540.54));
		hm.put(4, new Double(8473.49));
		
		Set<Integer> s=hm.keySet();
		Iterator<Integer> ir=s.iterator();
		while(ir.hasNext())
		{
			Integer x=(Integer)ir.next();
			System.out.println(hm.get(x));
		}

	}

}
