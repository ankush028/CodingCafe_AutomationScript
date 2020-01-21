package com.bridgelabz.codingcafe.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.pages.LoginPage;
import com.bridgelabz.codingcafe.pages.Registration;
import com.bridgelabz.codingcafe.util.CustomListener;

@Listeners(CustomListener.class)
public class RegistrationTest extends BaseClass{
	
	public LoginPage loginPage;
	public Registration register;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
	
		initiation();
		loginPage = new LoginPage();
		loginPage.login();
		register = new Registration();
	
	}
	
	@Test
	public void registerTest() throws InterruptedException {
		register.registration();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
