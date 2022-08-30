package com.assertclass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_T_F_E {
	@Test
	public void testone() {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		// find email
		WebElement findElement = driver.findElement(By.id("email"));
		// email is display
		boolean displayed = findElement.isDisplayed();
		
		Assert.assertTrue(displayed);
		// email is enable
		boolean enabled = findElement.isEnabled();
		
		Assert.assertTrue(enabled);
		
		System.out.println("emeil is display");
		
		System.out.println("emailis enabled");
		// enter password
		findElement.sendKeys("7094552888");
		// finding password
		WebElement password = driver.findElement(By.id("pass"));
		
		boolean displayed2 = password.isDisplayed();
		
		boolean enabled2 = password.isEnabled();	
		
		password.sendKeys("dhanushrilakha");
		// password is enable
		Assert.assertTrue(enabled2);
		// password is display
		Assert.assertTrue(displayed2);
		
		System.out.println("password is enable");
		
		System.out.println("password is display");
		
		String attribute = password.getAttribute("value");
		
		Assert.assertTrue(attribute.contains(attribute));
		
		System.out.println("attribute is contains");
		// 
		Assert.assertEquals(true,password.getAttribute("value").equals("7094552888") );
		
		System.out.println("yes password is equal");
		
		
		
		
		
		
		
		
		

	}
	

}
