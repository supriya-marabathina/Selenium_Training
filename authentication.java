package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class authentication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		WebDriver driver = new ChromeDriver(dc);
		
		//driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/");
		/*driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Basic Auth")).click();*/
		handleSSLerror(driver);
	}
	
	public static void handleSSLerror(WebDriver driver){
		driver.get("https://himapackers.com/");
		
	}
}
