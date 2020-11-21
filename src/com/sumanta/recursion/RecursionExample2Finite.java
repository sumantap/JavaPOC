package com.sumanta.recursion;

public class RecursionExample2Finite {
	static int count = 0;
	public static void main(String[] args) {
		p();
	}
	
	public static void p() {
		count++;
		if(count<=3) {
			System.out.println("Test:"+ count );
			p();
		}
	}
}
