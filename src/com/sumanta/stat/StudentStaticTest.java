package com.sumanta.stat;

public class StudentStaticTest {
	
	public static void main(String args[]){  
		StudentStatic.change();//calling change method  
		//creating objects  
		StudentStatic s1 = new StudentStatic(111,"Karan");  
		StudentStatic s2 = new StudentStatic(222,"Aryan");  
		StudentStatic s3 = new StudentStatic(333,"Sonoo");  
		//calling display method  
		s1.display();  
		s2.display();  
		s3.display();  
	}  
}
