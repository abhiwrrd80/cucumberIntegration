package com.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {
	public static WebDriver getDriver(String browser)
	{
		if(browser.equals("chrome"))
		{
			 return new ChromeDriver();
		}
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.01\\Desktop\\JAVA\\Day 3\\testMaven\\chromedriver.exe");
			 return new ChromeDriver();
	    }
		else 
		{
			return null;
		}
	}

}
