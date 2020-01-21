package com.bridgelabz.codingcafe.pages;

import java.text.ParseException;
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
public class AddCampaign extends BaseClass implements Generics{
	
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
	
	
	@FindBy(xpath = "//button[@aria-label='Next month']")
	WebElement nextMonth;
	
	public void onlineCampaign() throws InterruptedException, ParseException {
		addIcon.click();
		Thread.sleep(1000);
		selectCampaign.click();
		Thread.sleep(1000);
		campaignPurpose.click();
		Thread.sleep(1000);
		selectMCQ.click();
		Thread.sleep(2000);	
		
		List<WebElement> dates = new ArrayList<WebElement>(driver.findElements(By.xpath("//button[@type='button']")));
		Thread.sleep(1000);	
		dates.get(index_0).click();	
		Thread.sleep(1000);
		String currDateStr = driver.findElement(By.xpath("//span[contains(text(),'01/2020')]")).getText();
		int monthdiff = Utility.monthDifference(property.getProperty("startDate"),currDateStr);		
		for (int i=0;i<monthdiff;i++) {	
				driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();	
		}
		driver.findElement(By.xpath("//div[contains(text(),"+Utility.day()+")]")).click();
		Thread.sleep(2000);
		dates.get(index_1).click();
		int endDateMonthDiff=Utility.monthDifference(property.getProperty("endDate"),driver.findElement(By.xpath("//span[contains(text(),'07/2021')]")).getText());
		for(int i=0;i<endDateMonthDiff;i++) {
			driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
		}
		driver.findElement(By.xpath("//div[contains(text(),"+Utility.day()+")]")).click();;
		
		List<WebElement> elements = new ArrayList<WebElement>(driver.findElements(By.xpath("//input[@autocomplete='off']")));
		
		elements.get(index_1).sendKeys(property.getProperty("campaignName"));
		 Thread.sleep(1000); 
		elements.get(index_2).sendKeys(property.getProperty("creator"));
		 Thread.sleep(1000); 
		elements.get(index_3).sendKeys(property.getProperty("short"));
		 Thread.sleep(1000); 
		elements.get(index_6).sendKeys(attempts);
		 Thread.sleep(1000); 
		elements.get(index_8).sendKeys(hrs);
		 Thread.sleep(1000); 
		elements.get(index_9).sendKeys(minutes);
		 Thread.sleep(1000); 
		elements.get(index_10).sendKeys(hrs);
		 Thread.sleep(1000); 
		elements.get(index_11).sendKeys(minutes);
		 Thread.sleep(1000); 
		elements.get(index_12).sendKeys(passPercent);
		 Thread.sleep(3000); 
		List<WebElement> listBoxes= new ArrayList<WebElement>(driver.findElements(By.xpath("//mat-select[@role='listbox']")));	
		listBoxes.get(index_1).click();
		fellowship.click(); 
		Thread.sleep(1000); 
		listBoxes.get(index_2).click();
		extraInfo.click();
		Thread.sleep(1000);
		listBoxes.get(index_3).click();
		landPageTemplate.click();
		Thread.sleep(1000); 
		listBoxes.get(index_4).click();;  
		resultPageTemplate.click();
		
		Thread.sleep(5000);
		
	}

}
