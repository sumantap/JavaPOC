package com.sumanta.abstruct;

public class TestAbstructFlavor {
	public static void main(String args[]){  
		BikeWithFlavor obj = new HondaWithFlavor();  
		obj.run();  
		obj.changeGear();  
	}  
}
