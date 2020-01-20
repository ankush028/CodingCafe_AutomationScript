package com.bridgelabz.codingcafe.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Months;
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
		dates.get(0).click();
		String currDateStr = driver.findElement(By.xpath("//span[contains(text(),'01/2020')]")).getText();
		System.out.println(currDateStr);
		String setDateStr = property.getProperty("date");
		
		Date setDate= new SimpleDateFormat("dd/MM/yyyy").parse(setDateStr);
		System.out.println(setDate);
		Date currDate = new SimpleDateFormat("MM/yyyy").parse(currDateStr);
		System.out.println(currDate);
		int monthdiff = Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1),new DateTime(setDate)
				.withDayOfMonth(1)).getMonths();
		System.out.println(monthdiff);

		
		if(monthdiff<0) {
			monthdiff=-1*monthdiff;
		}
		String day = new SimpleDateFormat("dd").format(setDate);
		
		for (int i=0;i<monthdiff;i++) {
	
				driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
	
		}	
		System.out.println(currDateStr);
		System.out.println(day);
	
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
