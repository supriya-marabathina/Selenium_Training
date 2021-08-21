package com.webdriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionrunner {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		a.keyDown(Keys.SHIFT).click(driver.findElement(By.xpath("(//a[contains(text(),'Amazon Pay')])[1]"))).build().perform();
		Set<String> handleids=driver.getWindowHandles();
		Iterator it = handleids.iterator();
		ArrayList<String> ids = new ArrayList<>();
		while(it.hasNext()){
			ids.add((it.next()).toString());
		}
		driver.switchTo().window(ids.get(1));
		a.keyUp(Keys.SHIFT).build().perform();
		WebElement ele= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		ele.sendKeys("alexa");
		a.doubleClick(ele).build().perform();
		//a.contextClick().build().perform();
		a.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Fashion')])[1]"))).click().build().perform();
		
		//driver.quit();
		//mousehover(driver,a);
		dragdrop(driver, a);
		driver.quit();
	}
	
	public static void mousehover(WebDriver driver,Actions a) throws InterruptedException{
		driver.get("https://www.makemytrip.com/");
		a.click().build().perform();
		a.moveToElement(driver.findElement(By.className("introGBInfo"))).build().perform();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class='introGBTooltip whiteText']")).getText());
		
	}
	
	public static void dragdrop(WebDriver driver, Actions a) throws InterruptedException{
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		a.dragAndDrop(driver.findElement(By.xpath("//ul[@id='gallery']/li[1]")), driver.findElement(By.id("trash"))).build().perform();
		Thread.sleep(5000);
		
		
	}

}
