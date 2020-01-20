package com.bridgelabz.codingcafe.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.pages.AddCampaign;
import com.bridgelabz.codingcafe.pages.LoginPage;
import com.bridgelabz.codingcafe.pages.Registration;

public class AddCampaignTest extends BaseClass{
	
	public LoginPage loginPage;
	public AddCampaign addcampaign;
	public Registration register;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
	
		initiation();
	loginPage = new LoginPage();
	loginPage.login();
	addcampaign= new AddCampaign();
	register = new Registration();
	}
	
	@Test
	public void onlineCampaignTest() throws InterruptedException {
		addcampaign.onlineCampaign();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
