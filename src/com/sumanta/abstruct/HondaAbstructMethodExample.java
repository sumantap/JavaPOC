package com.sumanta.abstruct;

public class HondaAbstructMethodExample extends BikeAbstructMethodExample{
	void run(){
		System.out.println("running safely");
	}  
	
	public static void main(String args[]){  
		BikeAbstructMethodExample obj = new HondaAbstructMethodExample();  
		obj.run();
	}
}
