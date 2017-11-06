package com.atos.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map_challange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Ram",90);
		hm.put("Lakhan",55);
		hm.put("Shyam",99);
		
		HashMap<String, String> hmm=new HashMap<>();
		/*hmm.put("Ram", "Pass");
		hmm.put("Lakhan", "Fail");
		hmm.put("Shyam", "Pass");
		*/
		Set<String> s=(Set<String>)hm.keySet();
		Iterator<String> i1=s.iterator();
		while(i1.hasNext())
		{
			String x=i1.next();
			if(hm.get(x)>= 60)
			{
				hmm.put(x, "Pass");
			}
			else
				hmm.put(x, "Fail");
				
		}
		System.out.println(hmm);
		
	}

}
