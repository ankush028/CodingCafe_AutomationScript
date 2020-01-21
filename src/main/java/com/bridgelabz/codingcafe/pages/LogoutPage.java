package com.bridgelabz.codingcafe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.util.CustomListener;
@Listeners(CustomListener.class)
public class LogoutPage extends BaseClass{
	
	public LogoutPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//img[@class='profile-img']")
	WebElement profile;
	
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	WebElement logOut;
	
	public void logOut() throws InterruptedException {
		Thread.sleep(3000);
		profile.click();
		Thread.sleep(1000);
		logOut.click();
		Thread.sleep(6000);
	}
	
	
}
