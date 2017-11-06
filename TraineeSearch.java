package com.atos.java.collections;

import java.util.*;

public class TraineeSearch {

	
	public void find(List<Trainee> ls,String nm)
	{
		Trainee tr=new Trainee();
		boolean flag=true;
		Iterator<Trainee> it=ls.iterator();
		while(it.hasNext())
		{
			tr=it.next();
			if(tr.getName().equalsIgnoreCase(nm)&& flag)
			{
				System.out.println(tr.getId()+" "+tr.getName()+" "+tr.getScore());
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("Trainee with name "+nm+" not found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraineeSearch ts=new TraineeSearch();
		ArrayList<Trainee> train=new ArrayList<Trainee>();
		train.add(new Trainee(1,"Hari",97));
		train.add(new Trainee(2,"Chala",79));
		train.add(new Trainee(3,"Ghari",86));
		train.add(new Trainee(4,"Gupchup",78));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Trainee name to be searched");
		String name=sc.next();
		ts.find(train,name);
		sc.close();

	}

}
