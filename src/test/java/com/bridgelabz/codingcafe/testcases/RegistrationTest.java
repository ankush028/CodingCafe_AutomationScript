package com.bridgelabz.codingcafe.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.pages.LoginPage;
import com.bridgelabz.codingcafe.pages.Registration;

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
	
}
