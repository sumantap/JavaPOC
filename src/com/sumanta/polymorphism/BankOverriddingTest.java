package com.sumanta.polymorphism;

public class BankOverriddingTest {
	public static void main(String args[]){  
		WellFargoOverridding s=new WellFargoOverridding();  
		CityBankOverridding i=new CityBankOverridding();  
		
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		 
	}  
}
