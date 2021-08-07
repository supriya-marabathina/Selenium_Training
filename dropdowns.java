package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		try{
		// TODO Auto-generated method stub
		WebDriver driver = invokebrowser("edge");
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//staticdropdown(driver);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//li[@class='makeFlex column makeRelative vrtlCenter conCurLang geoSwitcher']/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='selectConWrap']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'UAE')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/label[@for='araLang']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		driver.close();
		}catch(Exception e){
			System.out.println(e);
		}
	
	
	}
	
	//static dropdown for spicejet
	public static void staticdropdown(WebDriver driver) throws InterruptedException{
		
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd= new Select(dropdown);
		Thread.sleep(2000);
		dd.selectByValue("BDT");
		Thread.sleep(2000);
		dd.selectByIndex(4);
		Thread.sleep(2000);
		dd.selectByVisibleText("USD");
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
