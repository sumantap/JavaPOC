package com.sumanta.stat;

public class CounterWithStatic {
	static int count = 0;
	
	CounterWithStatic(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		CounterWithStatic c = new CounterWithStatic();
		CounterWithStatic c1 = new CounterWithStatic();
		CounterWithStatic c2 = new CounterWithStatic();
	}
	
}
