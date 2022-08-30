package com.adactintask;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlepage {
	
	static WebDriver driver;
	@Test
	public void google() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver= new FirefoxDriver();
		
		// get url
		Thread.sleep(200);
		driver.get("https://www.bing.com/search?q=adactin+hotel+app&cvid=1db53e4ebcbe482cba8547f4e613a8b3&aqs=edge.1.69i57j0l5j46j0l2.6854j0j1&pglt=43&FORM=ANNTA1&DAF0=1&PC=U531");
		
		//driver.findElement(By.xpath("/html/body/div[1]/main/ol/li[1]/h2/a")).click();
		driver.findElement(By.xpath("//a[@id='snnachecj']")).click();
		
		String windowHandle = driver.getWindowHandle();
		
		

	}

}
