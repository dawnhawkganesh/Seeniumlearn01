package com.test.selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface Commons {

	WebElement getWebElementFor(WebDriver driver, String idComponent);
	
}
