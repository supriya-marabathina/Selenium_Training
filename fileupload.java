package com.webdriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", path);

		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		/*driver.get("https://smallpdf.com/pdf-to-word");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button/span")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Yerapa.Reddy\\Documents\\Personal\\upload.exe");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='tool_options'])[1]")));
		driver.findElement(By.xpath("(//input[@name='tool_options'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();*/
		download(driver,path);
	}
	
	public static void download(WebDriver driver,String path) throws InterruptedException{
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Download")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sample.txt")).click();
		Thread.sleep(2000);
		File f = new File(path+"/Sample.txt");
		
		if (f.exists()){
			System.out.println("file is downloaded");
			Thread.sleep(3000);
			f.delete();
		}
		
	}
}
