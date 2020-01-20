package com.bridgelabz.codingcafe.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.pages.LoginPage;
import com.bridgelabz.codingcafe.pages.LogoutPage;

public class LogoutPageTest extends BaseClass{
	
	public LoginPage loginPage;
	public LogoutPage logoutPage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initiation();
		loginPage = new LoginPage();
		loginPage.login();
		logoutPage= new LogoutPage();
		
	}
	
	@Test
	public void logoutPagetest() throws InterruptedException {
		logoutPage.logOut();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

