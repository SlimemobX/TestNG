package com.syntax.class01_HWCW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task3 {
//	Open chrome browser
//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//	Enter valid username and password
//	Click on login button
//	Then verify Syntax Logo is displayed
//	Close the browser
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt = 'OrangeHRM']"));
		if (logo.isDisplayed()) {
			System.out.println("The logo is there. Test Pass");
		}else {
			System.out.println("The logo is NOT there. Test Fail");
		}
	}
	

	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	


}
