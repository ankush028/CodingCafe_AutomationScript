package com.bridgelabz.codingcafe.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.pages.AddInstitution;
import com.bridgelabz.codingcafe.pages.LoginPage;
import com.bridgelabz.codingcafe.util.CustomListener;

@Listeners(CustomListener.class)
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
	  public void addCollegeTest() throws InterruptedException {
		  addinstitute.addCollege();
	  }
	  
	  @Test(priority = 2)
	  public void addTrainingInstituteTest() throws InterruptedException {
		  addinstitute.addTrainingInstitute();
	  }
	  
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }
	
}
