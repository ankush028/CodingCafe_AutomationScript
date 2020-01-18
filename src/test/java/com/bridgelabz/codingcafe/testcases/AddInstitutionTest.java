package com.bridgelabz.codingcafe.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.pages.AddInstitution;
import com.bridgelabz.codingcafe.pages.LoginPage;

public class AddInstitutionTest extends BaseClass {
	
	LoginPage loginPage;
	AddInstitution addinstitute;
	
	  @BeforeMethod 
	  public void setUp() throws InterruptedException {
	  
		  initiation();
		  loginPage = new LoginPage();
		  loginPage.login();
		  addinstitute = new AddInstitution();
	  }
	  
	  @Test(priority = 1)
	  public void addInstituteTest() throws InterruptedException {
		  addinstitute.addInstitution();
	  }
	  
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }
	
}