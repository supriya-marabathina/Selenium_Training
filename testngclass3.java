package testngtraining;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngclass3 {
	@AfterSuite
	public static void logout(){
		System.out.println("logged out successfully");
	}
	@Test
	public static void fundtransfer(){
		System.out.println(" navigated to fund transfer section");
	}
}
