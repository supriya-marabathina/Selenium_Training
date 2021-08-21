package com.webdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linksandimages {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dropdowns dropdowns = new dropdowns();
		WebDriver driver = dropdowns.invokebrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println(driver.findElements(By.tagName("img")).size());
		//ArrayList<WebElement> elements = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
	
		HttpURLConnection huc = null;
		for(WebElement ele:elements){
			String url = ele.getAttribute("href");
			if(url !=null){
			//System.out.println(url);
			
			
			huc = (HttpURLConnection)(new URL(url).openConnection());

			huc.setRequestMethod("HEAD");

			huc.connect();

			int respCode = huc.getResponseCode();
			
			System.out.println(respCode);
			
			
		}
		
	}
	}

}
