package com.sumanta.finall;

public class FinalVariableExample {
	final int speedlimit=90;//final variable  
	void run(){
		//You are trying to change final variable value
		//speedlimit=400;  
	}  
	public static void main(String args[]){  
		FinalVariableExample obj=new  FinalVariableExample();  
		obj.run();  
	}  
}
