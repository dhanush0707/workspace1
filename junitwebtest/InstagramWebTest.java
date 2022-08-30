package com.junitwebtest;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramWebTest {
	
	static WebDriver driver;
	
	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(3);
		WebElement findElement = driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));
		findElement.sendKeys("ace.jack.7");
		Thread.sleep(3);
		WebElement findElement2 = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		findElement2.sendKeys("kallu23.06.22");
		Thread.sleep(3);
		WebElement findElement3 = driver.findElement(By.xpath("//div[@class='   "
				+ "          qF0y9          Igw0E     IwRSH      "
				+ "eGOV_       acqo5   _4EzTm                     "
				+ "                                                "
				+ "                                         ']"));
		findElement3.click();
		Thread.sleep(3);
		WebElement findElement4 = driver.findElement(By.xpath("//button[text()='Show']"));
		findElement4.click();
		Thread.sleep(3);
		
		// face book login
		WebElement findElement5 = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
		findElement5.click();
		Thread.sleep(3);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("7094552888");
		Thread.sleep(3);
		WebElement findElement6 = driver.findElement(By.id("pass"));
		findElement6.sendKeys("dhanushrilakha");
		Thread.sleep(3);
		WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
		button.click();
		Thread.sleep(3);

	}
	@Before
	public void tesst2() {
		Date d= new Date();
		System.out.println(d);

	}
	@After
	public void test3() {
		Date d= new Date();
		System.out.println(d);

	}
	@BeforeClass
	public static void test4() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		Thread.sleep(3);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
	}
	@AfterClass
	public static void test() throws IOException, InterruptedException, AWTException {
		Thread.sleep(3);
		WebDriverManager.chromedriver().setup();
		Thread.sleep(3);
		TakesScreenshot ts=  (TakesScreenshot)driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f= new File("D:\\Pictures\\Screenshots\\screen.png");
		FileUtils.copyFile(screenshotAs, f);
		
		
		//Actions a=new Actions(driver);
		//Robot r = new Robot();
		
		//r.keyPress(KeyEvent.VK_WINDOWS);
		//r.keyPress(KeyEvent.VK_PRINTSCREEN);
		//a.sendKeys("printscan").perform();
		//r.keyRelease(KeyEvent.VK_PRINTSCREEN);
		//r.keyRelease(KeyEvent.VK_WINDOWS);
		
		//Wait<WebDriver> w= new FluentWait<WebDriver>(driver).withTimeout(50,TimeUnit.SECONDS);
		Date d= new Date();
		System.out.println(d);
		driver.quit();

	}
}
