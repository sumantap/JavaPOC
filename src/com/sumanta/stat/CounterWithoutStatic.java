package com.sumanta.stat;

public class CounterWithoutStatic {
	int count = 0;
	
	CounterWithoutStatic(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		CounterWithoutStatic c = new CounterWithoutStatic();
		CounterWithoutStatic c1 = new CounterWithoutStatic();
		CounterWithoutStatic c2 = new CounterWithoutStatic();
	}
	
}
