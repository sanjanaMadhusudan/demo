package com.Ecommerce.Shopping.appname.genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


/**
 * @author sanjana 
 *
 */
public class BaseTest extends Screenshoot implements AutoConstant{
	
	public ChromeDriver driver;
	
/**
 * 
 * @param value
 * @param key
 * @throws IOException
 * open application
 */
@BeforeMethod
public void openapp ()  throws IOException {

	System.setProperty(key,value);
	driver=new ChromeDriver();
	driver.get(PropertyFile.readpropertyfile("url"));
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


/**
 * close browser after taking screen shoot 
 * @param r 
 * ITestResult in-bulit interface	it has 2methods
 *  getstatus : 1= pass, 2=fail,3=skipped
 *  getname is a method gives name of failed testcases
 */
@AfterMethod
public void closeapp( ITestResult r) throws IOException {
	
	int status =r.getStatus();
	String name =r.getTestName();
	
	if(status==2){
		
		Screenshoot.takescreenshot(driver, name);

		
	}
	driver.close();
}

}
