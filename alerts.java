package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		dropdowns dropdowns = new dropdowns();
		WebDriver driver = dropdowns.invokebrowser("edge");
		//driver.get("https://www.spicejet.com/");
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("button[name='confirmalertbox']")).click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.name("promptalertbox1234")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("No");
		Thread.sleep(2000);
		driver.close();
	}

}
