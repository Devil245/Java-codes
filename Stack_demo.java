package com.atos.java.collections;

import java.util.Stack;

public class Stack_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st=new Stack<Integer>();
		st.push(30);
		st.push(20);
		st.push(40);
		System.out.println(st+"\nAfter pop");
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);

	}

}
