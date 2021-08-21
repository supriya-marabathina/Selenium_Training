package com.webdriver;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		String value ="Equal";
		softassertion();
		Assert.assertEquals("Equal", "equal");
		
		System.out.println("step is success");
	}
	
	public static void softassertion(){
		SoftAssert sa= new SoftAssert();
		sa.assertEquals("Equals", "equals");
		System.out.println("step is failing");
		sa.assertEquals("Equal", "Equal");
		System.out.println("step is passing");
		sa.assertAll();
	}

}
