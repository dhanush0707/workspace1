package com.baseclasscreation;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	static WebElement findelement;
	
	// browser launch
	public static void browserLaunch(String browserName) {
		
		switch (browserName) {
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			}
		// maximize
		driver.manage().window().maximize();
		
	}
	// get URl
	public static void launchUrl(String url) {
		// TODO Auto-generated method stub
//		switch(launchUrl) {
//		case"https://www.facebook.com/":
//			break;
//			
//		}
		driver.get("https://www.facebook.com/");
		// get title
				System.out.println(driver.getTitle());
				driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				System.out.println(driver.getPageSource());
	}
	// locator
	public static WebElement locator(String locatorName,String value) {
		
		switch(locatorName) {
		case"id":
			findelement=driver.findElement(By.id(value));
			break;
		case"name":
			findelement=driver.findElement(By.name(value));
			break;
		case"xpath":
			findelement=driver.findElement(By.xpath(value));
			break;
//		case"valve";
	//	driver.findElement(by.)
		
		}
		return findelement;
	}
	// send keys
	public static void typeText(WebElement ref,String value) {
		// TODO Auto-generated method stub
		ref.sendKeys(value);
	}
	
	
	// click
	public static void btnClick (WebElement ref) {
		ref.click();
	}
	public static void dragAndDrop(WebElement source,WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	public static void robott(int keys) throws AWTException {
		Robot r=new Robot();
		r.keyPress(keys);
		r.keyRelease(keys);
	}
	
		
	}
	


