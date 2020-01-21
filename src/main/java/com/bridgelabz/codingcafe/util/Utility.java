package com.bridgelabz.codingcafe.util;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.bridgelabz.codingcafe.base.BaseClass;

public class Utility extends BaseClass {

	public static Robot robot;
	public static Date setDate;
	
	public static void captureScreenShot(WebDriver driver,String screenShotName) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);	
		try {
			FileUtils.copyFile(src,new File("/home/admin1/Desktop/JavaAdvanced/CodingCafe/FailedTestScreenShot"+"/"+screenShotName+".png"));
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
	
	public static int monthDifference(String setDateStr,String currDateStr) throws ParseException {
		setDate= new SimpleDateFormat("dd/MM/yyyy").parse(setDateStr);
		Date currDate = new SimpleDateFormat("MM/yyyy").parse(currDateStr);
		int monthdiff = Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1),new DateTime(setDate)
				.withDayOfMonth(1)).getMonths();
		
		if(monthdiff<0) {
			monthdiff=-1*monthdiff;
			return monthdiff;
		}
		return monthdiff;
	}
	public static String day() {
		
		return new SimpleDateFormat("dd").format(setDate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
