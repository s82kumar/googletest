package com.org.ui.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.ui.common.googleBase;

/**
 * NewUSer Test clicks on New User Button and enter UserName, Password, Email.
 * if its new user it creates the user successfully 
 * if its old user it clicks on Cancel and perform the fitler functionaly on User Page.
 */
public class GoogleTest extends googleBase {

	
	public GoogleTest() {
		super();
	}

	@BeforeTest
	public void setUp() {

		setupApplication();
	}

	@Test
	public void testGoogleSearch() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@title = 'Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@alt='Google']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='gbqfbb']/../input[@value ='Google Search']")).click();
		

	}
	
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}

}
