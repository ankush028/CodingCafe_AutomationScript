package com.bridgelabz.codingcafe.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.util.CustomListener;
import com.bridgelabz.codingcafe.util.Generics;
import com.bridgelabz.codingcafe.util.Utility;

@Listeners(CustomListener.class)
public class Registration extends BaseClass implements Generics{
	
	public Registration() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Online Campaign')]")
	WebElement onlineCampaigndashboard;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailid;
	
	@FindBy(xpath = "//input[@ng-reflect-name='fullName']")
	WebElement fullName;
	
	@FindBy(xpath = "//mat-radio-button[@ng-reflect-value='male']")
	WebElement selectMale;
	
	@FindBy(xpath = "//input[@formcontrolname='phoneno']")
	WebElement mbNo;
	
	@FindBy(xpath = "//span[contains(text(),'Apply')]")
	WebElement apply;
	
	
	public void registration() throws InterruptedException {
		Thread.sleep(3000);
		onlineCampaigndashboard.click();
		Thread.sleep(1000);
		List<WebElement> urls = new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@mattooltip='click to copy URL']")));
		Thread.sleep(1000);
		urls.get(index_0).click();
		Thread.sleep(1000);
		Utility.openNewTab();
		ArrayList<String> newTab= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(index_1));
		Thread.sleep(2000);
		Utility.paste();
		Thread.sleep(5000);
		emailid.sendKeys(property.getProperty("emailid"));
		Thread.sleep(1000);
		fullName.sendKeys(property.getProperty("creator"));
		Thread.sleep(1000);
		selectMale.click();
		Thread.sleep(1000);
		mbNo.sendKeys(property.getProperty("mobileNumber"));
		Thread.sleep(1000);
		apply.click();
		Thread.sleep(6000);
				
	}
	
	
}
