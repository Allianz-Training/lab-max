package com.demo.hwoop2_3;

public class DiscountRate {
	public double serviceDiscountPremium = 0.2;
	public double serviceDiscountGold = 0.15;
	public double serviceDiscountSliver = 0.1;
	public double productDiscountPremium = 0.1;
	public double productDiscountGold = 0.1;
	public double productDiscountSliver = 0.1;
	
	public double getServiceDiscountRate(String type) {
		switch(type) {
		case "Premium":{
			return serviceDiscountPremium;
		}
		
		case "Gold":{
			return serviceDiscountPremium;
		}
		
		case "Silver":{
			return serviceDiscountSliver;
		}
		default:
			return 0;
		}
	}
	
	public double getProductDiscountRate(String type) {
		switch(type) {
		case "Premium":{
			return productDiscountPremium;
		}
		
		case "Gold":{
			return productDiscountPremium;
		}
		
		case "Silver":{
			return productDiscountSliver;
		}
		default:
			return 0;
		}
	}
}