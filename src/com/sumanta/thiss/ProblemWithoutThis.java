package com.sumanta.thiss;

public class ProblemWithoutThis {
	int rollno;  
	String name;  
	float fee;
	
	ProblemWithoutThis(int rollno,String name,float fee){  
		/*
		 * this.rollno=rollno;  
		 * this.name=name;  
		 * this.fee=fee;  
		 */
		rollno = rollno;
		name = name;
		fee = fee;
		
		
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  

