package com.sumanta.constructor;

//This class displays default constructors with default values
public class Student2Parameterized {
	int id;  
	String name;  
	
	//creating a parameterized constructor  
	Student2Parameterized(int i,String n){  
		id = i;  
		name = n;  
	}  
	//method to display the values  
	void display(){System.out.println(id+" "+name);}  

	public static void main(String args[]){  
		//creating objects and passing values  
		Student2Parameterized s1 = new Student2Parameterized(111,"Karan");  
		Student2Parameterized s2 = new Student2Parameterized(222,"Aryan");  
		//calling method to display the values of object  
		s1.display();  
		s2.display();  
	}  
}
