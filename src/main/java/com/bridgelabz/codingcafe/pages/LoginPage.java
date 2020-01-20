package com.bridgelabz.codingcafe.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bridgelabz.codingcafe.base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement googleLogin;
	
	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement user;
	
	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement pass;
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement next;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	public void login() throws InterruptedException {
		googleLogin.click();
		Thread.sleep(3000);
		List<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		Thread.sleep(2000);
		user.sendKeys(property.getProperty("email"));
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
		password.sendKeys(property.getProperty("password"));
		Thread.sleep(2000);
		next.click();
		Thread.sleep(4000);
		driver.switchTo().window(newTab.get(0));
		Thread.sleep(3000);
		
	}	
}
