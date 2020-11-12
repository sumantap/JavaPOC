package com.sumanta.stat;

public class StudentStatic {
	int rollno;  
	String name; 
	
	static String college = "ITS";  
	//static method to change the value of static variable  
	
	static void change(){  
		college = "BBDIT";  
	}  
	//constructor to initialize the variable  
	StudentStatic(int r, String n){  
		rollno = r;  
		name = n;  
	}  
	//method to display values  
	void display(){System.out.println(rollno+" "+name+" "+college);
	
	}  
}  
