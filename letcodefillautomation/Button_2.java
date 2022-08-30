package com.letcodefillautomation;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_2 extends Input_1{
	public WebDriver driver;
	@Ignore
	@Test
	public void button() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]"
				+ "/div/div/div/div[2]/app-menu/div/footer/a")).click();
		
		

	}

}
