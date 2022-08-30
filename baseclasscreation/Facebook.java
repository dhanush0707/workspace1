package com.baseclasscreation;

import org.openqa.selenium.WebElement;

public class Facebook extends BaseClass{
	public static void main(String[] args) {
		
		browserLaunch("chrome");
		launchUrl("");
		
	WebElement locator = locator("id", "email");
    typeText(locator, "7094552888");
    WebElement locator2 = locator("id", "pass");
    typeText(locator2, "dhanushrilakha");
    WebElement locator3 = locator("id","login");
    btnClick(locator3);
	
	}
	
	
	


}
