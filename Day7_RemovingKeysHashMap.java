package com.atos.java.collections;

import java.util.*;

public class Day7_RemovingKeysHashMap {
	public static void main(String[] args) {
		
		//fill your code here
		 HashMap<Integer, String>hm=new HashMap<Integer, String>();
        Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		while(count!=0)
		{
			hm.put(sc.nextInt(), sc.next());
			count--;
		}
	
        int size=UserMainCode.sizeOfResultandHashMap(hm);
        System.out.println(size);

		
sc.close();		
	}


}

class UserMainCode {
	public static int sizeOfResultandHashMap(HashMap<Integer, String> hm) {
		
		//fill your code here
		Set<Integer> s=hm.keySet();
		Iterator<Integer> i=s.iterator();
		while(i.hasNext())
		{
			int a=i.next();
			System.out.println(a);
			if(a%4==0)
			{
				hm.remove(a);
			}
		}
		
		return hm.size();
	}

}
