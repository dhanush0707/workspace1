package com.adactintask;
import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactintask.googlepage;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Login {
	
	static WebDriver driver;
	@Test
	public void login() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("dhanush");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[7]/td/a")).click();
		
		

	}
	

}
