package com.letcodefillautomation;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeIn {
//	@BeforeClass
//	public static void test1() {
//		WebDriverManager.chromedriver().setup();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		System.out.println("browser title"+driver.getTitle());
//	}
//	@AfterClass
//	public static void test2() {
//     System.out.println("success");
//	}
//	@Before
//	public void test3() {
//      Date d= new Date();
//      System.out.println(d);
//	}
//	@After
//	public void test4() {
//		// TODO Auto-generated method stub
//		Date d= new Date();
//		System.out.println(d);
//
//	}
	
	
public static WebDriver driver;
@Test                          // main page
public void mainPage() {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://letcode.in/");
	
	WebElement findElement = driver.findElement(By.xpath("//*[@id=\"testing\"]"));
	findElement.click();
	

}
}
