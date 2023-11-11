package com.singlton.Example;

public class Runner {
	public static void main(String[] args) {
		  
	MySingltonClass d1 = MySingltonClass.x();
	System.out.println(d1);
	
	  
	MySingltonClass d2 = MySingltonClass.x();
	System.out.println(d2);
	}

}
