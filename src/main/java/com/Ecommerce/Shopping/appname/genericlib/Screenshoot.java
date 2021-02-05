/**
 * 
 */
package com.Ecommerce.Shopping.appname.genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Madhusudan
 *
 */
public class Screenshoot implements AutoConstant{
/**
 * 
 * @param driver
 * @param name 
 * @param name 
 * @throws IOException 
 */
	public static String takescreenshot(WebDriver driver, String name) throws IOException {
		Date d =new Date();
		String date = d.toString().replaceAll(":", "-");
				
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src= t.getScreenshotAs(OutputType.FILE);
		File dest= new File(photofilepath +date +".png");
		FileUtils.copyFile(src, dest);
		return date;
		
	
/**
 * File dest= new File(photofilepath+date); can also be written as 
 * AutoConstant(interface name).pathname inherit 
 * 
 */
		
		
	}
}
