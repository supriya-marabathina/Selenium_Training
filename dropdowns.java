package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.EqualsMethod;

public class dropdowns {

	public static void main(String[] args) {
		try{
		// TODO Auto-generated method stub
		WebDriver driver = invokebrowser("Chrome");
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//staticdropdown(driver);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		/*driver.findElement(By.xpath("//li[@class='makeFlex column makeRelative vrtlCenter conCurLang geoSwitcher']/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='selectConWrap']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'UAE')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/label[@for='araLang']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();*/
		
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li/div/div/p[contains(text(),'Mumbai')])[1]")).click();
		//driver.findElement(By.xpath("(//li/div/div/p[contains(text(),'Mumbai')])[1]")).getText();
		System.out.println(driver.findElement(By.id("fromCity")).getAttribute("value"));
		
		System.out.println(driver.findElement(By.id("fromCity")).getAttribute("scrollHeight"));
        String value = driver.findElement(By.xpath("//span[@data-cy='defaultFromValue']")).getText();
        
        System.out.println(value);      
        
		Thread.sleep(2000);
		
		if(!driver.findElement(By.xpath("//input[@placeholder='To']")).isDisplayed()){
		driver.findElement(By.id("toCity")).click();
		}
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("del");
		driver.findElement(By.xpath("(//li/div/div/p[contains(text(),'Delhi')])[1]")).click();
		Thread.sleep(2000);
		/*if(driver.findElement(By.xpath("//input[@placeholder='To']")) != null){
			driver.findElement(By.id("toCity")).click();
		}
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("ben");
		driver.findElement(By.xpath("(//li/div/div/p[contains(text(),'Bengaluru')])[1]")).click();*/
		//driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day--today')]")).click();
		//driver.findElement(By.xpath("(//div[@class='DayPicker-Months']/div[contains(@class,'DayPicker-Month')])[2]//div[@class='DayPicker-Week'][1]/div[6]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day')][1]")).getAttribute("aria-disabled"));
		//month's locator
		//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']/div
		boolean next = selectdate(driver);
		if(!next){
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			selectdate(driver);
		}
		Thread.sleep(2000);
										//input[@id='travellers'] --xpath
		driver.findElement(By.xpath("//span[contains(text(),'Travellers')]")).click();
		List<WebElement> adults = driver.findElements(By.xpath("//p[@data-cy='adultRange']/following-sibling::ul[contains(@class,'gbCounter')]/li"));
		int i=1;
		for(WebElement adult: adults){
			if(adult.getText().contains("6")){
				String xpath = "//p[@data-cy='adultRange']/following-sibling::ul[contains(@class,'gbCounter')]/li["+i+"]";
				driver.findElement(By.xpath(xpath)).click();
			}
			i++;
		}
		
		driver.findElement(By.xpath("//li[contains(text(),'Business')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
	/*	//date locator
		//div[contains(@class,'DayPicker-Day')]/div
		List<WebElement> dates =driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Day')]/div"));
		for(WebElement date:dates){
			//System.out.println(date.getText());
		}*/
			Thread.sleep(2000);
			//System.out.println(driver.findElement(By.xpath("//button[@id='search-button']")).getAttribute("aria-disabled"));
			driver.findElement(By.xpath("//div[@class='hsw_inputBox']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[contains(text(),'ADULTS')]/following-sibling::ul/li[contains(text(),'1')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'DONE')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='search-button']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[contains(text(),'Popular')]/following-sibling::div//span[@title='Non Stop']/preceding::span[@class='customCheckbox']")).click();
			Thread.sleep(2000);
			driver.close();
		}catch(Exception e){
			System.out.println(e);
		}
	
	
	}
	
	public static boolean selectdate(WebDriver driver){
		List<WebElement> months =driver.findElements(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']/div"));
		int i=1;
		boolean next = false;
		//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']/following-sibling::div[@class='DayPicker-Body']//div[contains(@class,'DayPicker-Day')][@aria-disabled='false']
			for(WebElement month:months){
				if(month.getText().contains("October")){
					next =true;
					String xpath= "(//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption'])["+i+"]/following-sibling::div[contains(@class,'DayPicker-Body')]//div[contains(@class,'DayPicker-Day')]/div/p[1]";
					//String xpath1=String.format("[%s]/following-sibling::div[contains(@class,'DayPicker-Body')]//div[contains(@class,'DayPicker-Day')]/div", month);
					//System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']/following-sibling::div[contains(@class,'DayPicker-Body')]//div[contains(@class,'DayPicker-Day')]/div")).getText());
					List<WebElement> dates =driver.findElements(By.xpath(xpath));
					for(WebElement date:dates){
						if (date.getText().equals("7")){
								date.click();
								break;
						}						
					}
				break;
				}
				i++;				
		}
			return next;
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
