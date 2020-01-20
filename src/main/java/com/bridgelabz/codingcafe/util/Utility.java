package com.bridgelabz.codingcafe.util;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility  {

	public static final int pageload=2;
	public static final int wait =10;
	public static final int pageNo=1;
	public static Robot robot;
//	public static JavascriptExecutor js ;
	
	public static void captureScreenShot(WebDriver driver,String screenShotName) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);	
		try {
			FileUtils.copyFile(src,new File("/home/admin1/Desktop/JavaAdvanced/"
					+ "Linkedin/FailedTestScreenShot"+"/"+screenShotName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public static void openNewTab()  {
		try {
			robot= new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		
	}
	public static void paste()   {
		try {
			robot= new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
