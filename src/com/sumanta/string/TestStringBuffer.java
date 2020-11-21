package com.sumanta.string;

public class TestStringBuffer {
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		
		////StringBuffer Insert
		
		StringBuffer sb1=new StringBuffer("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello  
		
		////StringBuffer Replace
		StringBuffer sb3=new StringBuffer("Hello");  
		sb3.replace(1,3,"Java");  
		System.out.println(sb3);//prints HJavalo
		
		////StringBuffer Delete
		StringBuffer sb4=new StringBuffer("Hello");  
		sb4.delete(1,3);  
		System.out.println(sb4);//prints Hlo  
		
		////StringBuffer reverse
		StringBuffer sb5=new StringBuffer("Hello");  
		sb5.reverse();  
		System.out.println(sb5);//prints olleH  
		
		////Stringbuffer Capacity
		StringBuffer sb6=new StringBuffer();  
		System.out.println(sb6.capacity());//default 16  
		sb6.append("Hello");  
		System.out.println(sb6.capacity());//now 16  
		sb6.append("java is my favourite language");  
		System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		
		
		
	} 
}
