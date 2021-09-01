package testngtraining;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngclass4 {
	@Test(groups={"Smoke"})
	public static void carloan(){
		System.out.println("carloan page");
	}
	@Test(groups={"Smoke"})
	public static void personalloan(){
		System.out.println(" personalloan page");
	}
	@Test
	public static void homeloan(){
		System.out.println(" homeloan page");
	}
	@Test(groups={"Smoke","regression"})
	public static void rewards(){
		System.out.println(" rewards page");
	}
}
