package com.sumanta.string;

public class TestStringIntern {
	public static void main(String[] args) {
		String s=new String("Sachin");  
		String s2=s.intern();  
		System.out.println(s2);//Sachin 
	}
}
