package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		dropdowns dropdowns = new dropdowns();
		WebDriver driver = dropdowns.invokebrowser("Chrome");
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("sign-in-icon-down")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//*[@id='otp-container']")).isEnabled());
		
	}

}
