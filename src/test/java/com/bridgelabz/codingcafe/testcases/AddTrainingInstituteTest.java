package com.bridgelabz.codingcafe.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.pages.AddTrainingInstitute;
import com.bridgelabz.codingcafe.pages.LoginPage;

public class AddTrainingInstituteTest extends BaseClass{

	LoginPage loginPage;
	AddTrainingInstitute addtraininginst;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initiation();
		loginPage = new LoginPage();
		loginPage.login();
		addtraininginst = new AddTrainingInstitute();		
	}
	@Test
	public void addtrainingInstitutetest() throws InterruptedException {
		addtraininginst.addTrainingInstute();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
