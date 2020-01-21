package com.bridgelabz.codingcafe.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.codingcafe.base.BaseClass;
import com.bridgelabz.codingcafe.mcq.QuestionFormat;
import com.bridgelabz.codingcafe.pages.LoginPage;
import com.bridgelabz.codingcafe.util.CustomListener;

@Listeners(CustomListener.class)
public class QuestionFormatTest extends BaseClass{
	
	public LoginPage loginPage;
	public QuestionFormat queFormat;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
	
		initiation();
	loginPage = new LoginPage();
	loginPage.login();
	queFormat = new QuestionFormat();
	
	}
	
	@Test
	public void testFormatTest() throws InterruptedException {
		queFormat.testFormat();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
