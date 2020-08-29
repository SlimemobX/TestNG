package com.syntax.class01_HWCW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task4 {
//	Open chrome browser
//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//	Enter valid username
//	Leave password field empty
//	Verify error message with text “Password cannot be empty” is displayed.

	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test
	public void invalidLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#btnLogin")).click();

		WebElement checkText = driver.findElement(By.xpath("//span[@id = 'spanMessage']"));
		if (checkText.isDisplayed()) {
			String message = checkText.getText();
			if (message.equals("Password cannot be empty")) {
				System.out.println("The message is correct");
			} else {
				System.out.println("The message is wrong");
			}
		}

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
