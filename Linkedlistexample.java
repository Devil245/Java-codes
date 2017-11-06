package com.atos.java.collections;
import java.util.*;
public class Linkedlistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*LinkedList<String> st=new LinkedList<String>();
		st.add("Bhau");
		st.add("Kadam");
		st.addFirst("stain");
		st.addLast("Vadh");
		st.add(3, "mama");
		//st.removeFirst();
		System.out.println(st);
		//st.removeLast();
		System.out.println(st);
		for(String x : st)
		{
			System.out.println(x);
		}
		for(int i=0;i<st.size();)
		{
			System.out.println(st.get(i));
			i=i+2;
		}
*/
		
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(25);
		ls.add(30);
		ls.add(11);
		ls.add(18);
		ls.add(26);
		
		for(Integer z:ls)
		{
			if(z%2==0)
			{
				System.out.println(z);
			}
			
		}
		
		Iterator <Integer> ir=ls.iterator();
			while(ir.hasNext())
			{
				Integer a=(Integer)ir.next();
				System.out.println(a);
			}
			
			
		
	}

}
