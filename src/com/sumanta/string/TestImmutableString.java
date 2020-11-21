package com.sumanta.string;

public class TestImmutableString {
	public static void main(String[] args) {
		String s = "Sachin";
		s.concat("Tendulakr");
		
		//It is still going to print Sachin as String is immutable
		System.out.println(s);
		
		//But if we explicitely assign it to the reference variable, 
		//it will refer to "Sachin Tendulkar" object.For example:
		
		s = s.concat("Tendulkar");
		System.out.println(s);
	}
}
