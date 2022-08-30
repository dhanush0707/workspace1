package com.letcodefillautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input_1 extends LetCodeIn{
	
	
	@Test
	public void input() throws AWTException {
		WebDriverManager.chromedriver().setup();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section"
				+ "[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("dhanush");
		
		// robot class  // tab operation
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"join\"]"));
		findElement.getAttribute("id");
		
		//driver.findElement(By.xpath("//*[@id=\\\"join\\\"]")).getAttribute("enter");
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"getMe\"]"));
        System.out.println(findElement2.isEnabled()+"yes ______is enable");	
        
        driver.navigate().back();
	}
	
	
	
	@Test
	private void select() {
       WebDriver driver;
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]"
				+ "/div/div/div/div[3]/app-menu/div/footer/a")).click();
		
	}
	
	

}
