package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//to strictle implemet driver functionalities we need to call webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://linkedin.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://redbus.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new FirefoxDriver();*/
		driver.close();//will close a particular window on which url script is running
		driver.quit(); //will close all opened windows
		
		
		driver.findElement(By.id("src"));
		}catch(Exception e){
			
		}
		
		
		//interface
	}

}
