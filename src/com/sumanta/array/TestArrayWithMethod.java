package com.sumanta.array;

public class TestArrayWithMethod {
	public static void main(String[] args) {
		int a[]= {33,3,4,5};
		min(a);
	}

	private static void min(int[] a) {
		// TODO Auto-generated method stub
		int min = a[0];
		for(int i=1;i<a.length;i++)  
			 if(min>a[i])  
			  min=a[i];  
		 System.out.println(min);  
	}
}
