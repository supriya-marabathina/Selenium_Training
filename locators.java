package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//to strictle implemet driver functionalities we need to call webdriver
		
		WebDriver driver = invokebrowser("edge");
		/*driver.get("https://www.facebook.com/");
		//types of locators
		//id		
		driver.findElement(By.id("email")).sendKeys("my username");
		driver.findElement(By.id("pass")).sendKeys("my passowrd");
		//classname
		System.out.println(driver.findElement(By.className("_8eso")).getText());*/
		/*driver.get("https://www.redbus.in/");
		driver.findElement(By.className("bc")).click();*/
		/*driver.navigate().to("https://www.facebook.com/");
		//name
		driver.findElement(By.name("email")).sendKeys("username");*/
		//linktext
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("Create a")).click();
		
		
		//css- can be created in n number of ways
		/*driver.findElement(By.cssSelector("input#email.inputtext._55r1._6luy")).clear();
		driver.findElement(By.cssSelector("input#email.inputtext._55r1._6luy")).sendKeys("my emailid");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("password");
		//driver.findElement(By.cssSelector("#pass.inputtext._55r1._6luy._9npi")).sendKeys("password");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("password");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("password");*/
		
		
		//xpath - can be created in n number of ways
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("alexa");
		//driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("alexa");
		
		driver.findElement(By.xpath("(//div[@id='nav-xshop']/a/following::a)[1]")).click();
		driver.findElement(By.xpath("(//div[@id='nav-xshop']/a/following-sibling::a)[3]")).click();
		driver.findElement(By.xpath("//*[@type='text'][@dir='auto']")).sendKeys("speaker");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@type='text'][@dir='auto']")).getTagName());
		Thread.sleep(2000);
		driver.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static WebDriver invokebrowser(String browser){
		WebDriver driver = null;
		if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equals("edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\edgedriver_win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		return driver;
	}

}
