package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.test.selenium.common.Commons;
import com.test.selenium.common.CommonsImpl;
import com.test.selenium.config.WebDriverLocalConfig;

public class AutomationPractice extends WebDriverLocalConfig {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = getWebDriverLocal();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click(); //to click the sign in button
		Thread.sleep(3000);
		boolean a = driver.findElement(By.xpath("//span/i[@class='icon-user left']")).isDisplayed(); //to check the presence of create an account button
		System.out.println(a);
		driver.findElement(By.xpath("//span/i[@class='icon-user left']")).click(); //to click the create an account button
		Thread.sleep(9000);
		boolean b = driver.findElement(By.xpath("//div[@id='create_account_error']")).isDisplayed();
		System.out.println(b);
		String c = driver.findElement(By.xpath("//div[@id='create_account_error']")).getText();
		System.out.println(c);
		boolean d = driver.findElement(By.xpath("//input[@id='email_create']")).isDisplayed();
		System.out.println(d);
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("r.ganesh.bharathi@gmail.com");
		driver.findElement(By.xpath("//span/i[@class='icon-user left']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Ganesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Bharathi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(" 12345 ");
		driver.findElement(By.xpath("//select[@id='days']")).click();
		WebElement ops = driver.findElement(By.xpath("//select[@id='days']"));
		Select drp = new Select(ops);
		drp.selectByValue("1");
		WebElement ops1 = driver.findElement(By.xpath("//select[@id='months']"));
		Select drp1 = new Select (ops1);
		drp1.selectByValue("12");
		WebElement ops2 = driver.findElement(By.xpath("//select[@id='years']"));
		Select drp2 = new Select (ops2);
		drp2.selectByValue("1993");
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ganesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Bharathi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("XYZ Company");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Karungalpatty");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Second Street");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Salem");
		WebElement ops3 = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select drp3 = new Select (ops3);
		drp3.selectByValue("31");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("87120");
		WebElement ops4 = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select drp4 = new Select (ops4);
		drp4.selectByValue("21");
		driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("No other information needed");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("91505857563");
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Dubai");
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		driver.quit();
	}
}