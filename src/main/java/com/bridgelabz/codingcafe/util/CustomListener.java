package com.bridgelabz.codingcafe.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.bridgelabz.codingcafe.base.BaseClass;

public class CustomListener extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		Utility.captureScreenShot(driver,result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
