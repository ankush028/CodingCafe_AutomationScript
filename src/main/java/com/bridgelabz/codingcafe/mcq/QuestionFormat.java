package com.bridgelabz.codingcafe.mcq;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.util.Generics;

public class QuestionFormat extends BaseClass implements Generics{
	
	public QuestionFormat() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//p[contains(text(),'Settings')]")
	WebElement settings;
	
	
	@FindBy(xpath = "//mat-radio-button[@ng-reflect-value='Medium']")
	WebElement testType;
	
	@FindBy(xpath = "//div[@class='mat-select-value']")
	WebElement timeDuration;
	
	@FindBy(xpath = "//span[contains(text(),'TestJava')]")
	WebElement testJava;
	
	List<WebElement> addButtons;
	List<WebElement> checkBox;
	List<WebElement> elements;
 	
	public void testFormat() throws InterruptedException {
		settings.click();
		addButtons = new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='add-btn']")));
		addButtons.get(index_3).click();
		elements= new ArrayList<WebElement>(driver.findElements(By.xpath("//input[@autocomplete='off']")));
		elements.get(index_1).sendKeys(property.getProperty("testname"));
		checkBox= new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='mat-checkbox-inner-container']")));
		Thread.sleep(1000);
		checkBox.get(index_0).click();
		Thread.sleep(1000);
		checkBox.get(index_1).click();
		testType.click();
		elements.get(index_2).sendKeys("10");
		elements.get(index_3).sendKeys("50");
		elements.get(index_4).sendKeys("20");
		elements.get(index_5).sendKeys("20");
		elements.get(index_6).sendKeys("100");
		timeDuration.click();
		testJava.click();
		Thread.sleep(6000);
		
	}

}
