package com.test.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLocalConfig {

	public static WebDriver getWebDriverLocal() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation Testing\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		//driver.manage().window().maximize();
		
		return driver;
	}
}
