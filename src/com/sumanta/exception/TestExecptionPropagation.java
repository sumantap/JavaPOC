package com.sumanta.exception;

import java.io.IOException;

public class TestExecptionPropagation {
	void m(){  
		int data=50/0;  
	}  
	void n(){  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){System.out.println("exception handled");}  
	}  
	public static void main(String args[]){  
		TestExecptionPropagation obj=new TestExecptionPropagation();  
		obj.p();  
		System.out.println("normal flow...");  
	}   
}
