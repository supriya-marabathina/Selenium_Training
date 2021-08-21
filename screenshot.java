package com.webdriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dropdowns dropdowns = new dropdowns();
		WebDriver driver = dropdowns.invokebrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		 File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
		 
         //Move image file to new destination

             File DestFile=new File("C:\\Users\\Yerapa.Reddy\\Downloads\\eclipse-java-neon-3-win32-x86_64\\eclipse\\sc.jpg");

             //Copy file at destination

             FileUtils.copyFile(SrcFile, DestFile);
	}

}
