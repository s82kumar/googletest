package com.org.ui.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base Class to create driver instance and to setup application for automation
 * 
 */
public  class googleBase {
	// Base component variables
	public static WebDriver driver; 
	//String url = "https://www.google.com/";
	/**
	 * The BaseComponent constructor
	 *
	 * @param webDriver The current Selenium WebwebDriver
	 */
	
	public googleBase() {
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		driver = new ChromeDriver();
		}
	}

	public String loadProperty() {
		 Properties prop = new Properties();

	        try {
	            //load a properties file
	        prop.load(new FileInputStream("C:\\Users\\mansan\\maven-project\\googleTest\\Resources\\automation.properties"));

	            //get the property value and print it out
	        System.out.println(prop.getProperty("url"));
	        } catch (IOException ex) {
	        ex.printStackTrace();
	        }
	        return prop.getProperty("url");
	}
	public void setupApplication() {
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loadProperty();
		driver.get(loadProperty());

	}

	
}
