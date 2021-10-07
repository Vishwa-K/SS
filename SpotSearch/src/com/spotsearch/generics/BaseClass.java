package com.spotsearch.generics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	/**
	 * Generic method to open the browser
	 * @param openBrowser
	 */
	@BeforeTest
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	public void openWebsite(String websiteUrl)
	{
		driver.get(websiteUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	public void login(String email, String password)
	{
		driver.findElement(By.xpath("(//a['Login'])[2]")).click();
		driver.findElement(By.id("email")).sendKeys(email+Keys.TAB+password);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		org.testng.Reporter.log("Logged IN",true);
	}

	
	
	
	
	
	public void logout()
	{
		driver.findElement(By.xpath("//span[.='T']")).click();
		driver.findElement(By.xpath("//span[.='Logout']")).click();
		org.testng.Reporter.log("Logged out",true);
	}

	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}

}

