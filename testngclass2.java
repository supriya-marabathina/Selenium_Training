package testngtraining;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngclass2 {
	@BeforeSuite
	public static void login(){
		System.out.println("logged in successfully");
	}
	@Test
	public static void creditcard(){
		System.out.println(" navigated to credit card section");
	}
	
	@BeforeTest
	public static void verification(){
		System.out.println(" navigated to login page successfully");
	}
	
	@AfterTest
	public static void verifycreditcardpage(){
		System.out.println(" navigated to credit card section successfully");
	}
}
