package com.bridgelabz.codingcafe.testcases;

import java.text.ParseException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.pages.AddCampaign;
import com.bridgelabz.codingcafe.pages.LoginPage;

public class AddCampaignTest extends BaseClass{
	
	public LoginPage loginPage;
	public AddCampaign addcampaign;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
	
		initiation();
	loginPage = new LoginPage();
	loginPage.login();
	addcampaign= new AddCampaign();
	}
	
	@Test
	public void onlineCampaignTest() throws InterruptedException, ParseException {
		addcampaign.onlineCampaign();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
