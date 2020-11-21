package com.sumanta.string;

public class TestStringComparison1 {
	public static void main(String[] args) {
		String s = "Sachin";
		String s1 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Sourav";
		
		System.out.println(s.equals(s1));//true  
		System.out.println(s.equals(s3));//true  
		System.out.println(s.equals(s4));//false
	}
}
