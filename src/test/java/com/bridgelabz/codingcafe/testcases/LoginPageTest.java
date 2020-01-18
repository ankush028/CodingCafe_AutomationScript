package com.bridgelabz.codingcafe.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage loginPage;

	
	  @BeforeMethod 
	  public void setUp() {
  	  
		  initiation();
		  loginPage = new LoginPage();
	 
	  }
	 
	@Test
	public void logintest() throws InterruptedException {
		
		loginPage.login();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
