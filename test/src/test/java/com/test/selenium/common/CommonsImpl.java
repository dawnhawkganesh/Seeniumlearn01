package com.test.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonsImpl implements Commons {

	@Override
	public WebElement getWebElementFor(WebDriver driver, String idComponent) {
		String selectId = "//select[@id='"+idComponent+"']";
		return driver.findElement(By.xpath(selectId));
	}

}
