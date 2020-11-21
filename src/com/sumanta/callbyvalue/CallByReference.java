package com.sumanta.callbyvalue;

public class CallByReference {
	int data=50;  
	  
	 void change(CallByReference op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
		 CallByReference op=new CallByReference();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);  
	  
	 }  
}
