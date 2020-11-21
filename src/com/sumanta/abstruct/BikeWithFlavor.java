package com.sumanta.abstruct;

public abstract class BikeWithFlavor {
	 BikeWithFlavor(){
		 System.out.println("bike is created");
	 }  
	 
	 abstract void run();
	 
	 void changeGear(){System.out.println("gear changed");}  
}
