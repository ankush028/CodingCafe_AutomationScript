package com.bridgelabz.codingcafe.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bridgelabz.codingcafe.base.BaseClass;

public class AddCampaign extends BaseClass{
	
	public AddCampaign() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[@class='addicon']//img")
	WebElement addIcon;
	
	@FindBy(xpath = "//button[contains(text(),'Campaign')]")
	WebElement selectCampaign;
	
	@FindBy(xpath = "//mat-select[@role='listbox']")
	WebElement campaignPurpose;
	
	@FindBy(xpath = "//span[contains(text(),'MCQ')]")
	WebElement selectMCQ;
		
	@FindBy(xpath = "//span[contains(text(),'Fellowship')]")
	WebElement fellowship;
	
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement extraInfo;
	
	@FindBy(xpath = "//span[contains(text(),'CodingCafeRegisterPage')]")
	WebElement landPageTemplate;
	
	@FindBy(xpath = "//span[contains(text(),'CodingCafeResultPage')]")
	WebElement resultPageTemplate;
	
	
	
	public void onlineCampaign() throws InterruptedException {
		addIcon.click();
		Thread.sleep(1000);
		selectCampaign.click();
		Thread.sleep(1000);
		campaignPurpose.click();
		Thread.sleep(1000);
		selectMCQ.click();
		Thread.sleep(1000);		
		List<WebElement> elements = new ArrayList<WebElement>(driver.findElements(By.xpath("//input[@autocomplete='off']")));
		
		elements.get(1).sendKeys(property.getProperty("campaignName"));
		 Thread.sleep(1000); 
		elements.get(2).sendKeys(property.getProperty("creator"));
		 Thread.sleep(1000); 
		elements.get(3).sendKeys(property.getProperty("short"));
		 Thread.sleep(1000); 
		elements.get(6).sendKeys("20");
		 Thread.sleep(1000); 
		elements.get(8).sendKeys("01");
		 Thread.sleep(1000); 
		elements.get(9).sendKeys("30");
		 Thread.sleep(1000); 
		elements.get(10).sendKeys("01");
		 Thread.sleep(1000); 
		elements.get(11).sendKeys("30");
		 Thread.sleep(1000); 
		elements.get(12).sendKeys("40");
		 Thread.sleep(3000); 
		List<WebElement> listBoxes= new ArrayList<WebElement>(driver.findElements(By.xpath("//mat-select[@role='listbox']")));
		
		listBoxes.get(1).click();
		fellowship.click(); 
		Thread.sleep(1000); 
		listBoxes.get(2).click();
		extraInfo.click();
		Thread.sleep(1000);
		listBoxes.get(3).click();
		landPageTemplate.click();
		Thread.sleep(1000); 
		listBoxes.get(4).click();;  
		resultPageTemplate.click();
		
		Thread.sleep(5000);
		
	}

}
