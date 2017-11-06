package com.atos.java;

public class Mymap {
	
	private String key;
	private int value;
	Mymap[] ma=new Mymap[10];
	public Mymap() {}
	

	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
	public Mymap getMap(String key)
	{
		for(int i=0;i<10;i++)
		{
			Mymap m=ma[i];
            System.out.println(key);
			if(m.getKey().equals(key))
				return m;
		}
		return null;
	}
	
	public void insert(String key,int value)
	{
		Mymap x=getMap(key);
		if(x!=null)
		{
			x.setValue(value);
		}
		else
		{
		Mymap m=new Mymap();
		m.setKey(key);
		m.setValue(value);
		for(int i=0;i<10;i++)
		{
			if(ma[i]==null)
			{
				ma[i]=m;break;
			}
		}
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymap m=new Mymap();
		m.insert("Peter", 1);
		m.insert("John", 2);
		m.insert("John", 3);

	}

}
