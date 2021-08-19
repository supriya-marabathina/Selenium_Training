package com.webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class windohandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dropdowns dropdowns = new dropdowns();
		WebDriver driver = dropdowns.invokebrowser("edge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		//driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//li[@data-creative='offer-banner']")).click();
		Set<String> windows=driver.getWindowHandles();//[parent id, child id]
		Iterator it = windows.iterator();
		it.hasNext();
		String parentId= (String) it.next();
		String childId= (String) it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.className("offerHeading")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	}

}
