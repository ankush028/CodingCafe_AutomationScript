package com.bridgelabz.codingcafe.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.codingcafe.base.BaseClass;

public class AddTrainingInstitute extends BaseClass{
		
	public AddTrainingInstitute() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[@class='addicon']//img")
	 WebElement addIcon;

	@FindBy(xpath = "//button[contains(text(),'Institutions')]")
	WebElement selectInstitute;
		
	@FindBy(xpath = "//mat-radio-button[@ng-reflect-value='TRAINING_INSTITUTE']")
	WebElement selectTrainingInst;
	
	@FindBy(xpath = "//input[@placeholder='Select institute']")
	WebElement instituteName;
	
	@FindBy(xpath = "//textarea[@placeholder='Address']")
	WebElement address;

	@FindBy(xpath = "//mat-label[@class='title']")
	WebElement title;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement cancel;
	
	public void addTrainingInstute() throws InterruptedException {
		Thread.sleep(2000);
		addIcon.click();
		Thread.sleep(1000);
		selectInstitute.click();
		Thread.sleep(1000);
		selectTrainingInst.click();
		instituteName.sendKeys(property.getProperty("institute"));
		Thread.sleep(1000);
		title.click();
		address.sendKeys(property.getProperty("address"));
		List<WebElement> elements = new ArrayList<WebElement>(driver.findElements(By.xpath("//input[@maxlength='15']")));
		elements.get(0).sendKeys(property.getProperty("short"));
		Thread.sleep(1000);
		elements.get(1).sendKeys(property.getProperty("branch"));
		Thread.sleep(1000);
		elements.get(2).sendKeys(property.getProperty("city"));
		Thread.sleep(3000);
		cancel.click();
		Thread.sleep(5000);
		
	}

	
}