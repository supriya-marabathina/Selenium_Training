package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dropdowns dropdowns = new dropdowns();
		WebDriver driver = dropdowns.invokebrowser("Chrome");
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("sign-in-icon-down")).click();
		
		driver.findElement(By.id("signInLink")).click();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("content");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		System.out.println(driver.findElement(By.xpath("//div[@class='new-signin-header m-l-44']")).getText());
	}

}
