/**
 * 
 */
package com.Ecommerce.Shopping.appname.genericlib;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author sanjana
 *
 */
public class Utilies {
	/**
	 * 
	 * @param ele
	 * @param text
	 */
	public static void Dropdown(WebElement ele, String text) {
		Select s= new Select(ele); //ele is the address
		s.selectByVisibleText(text);//text to be selected 
		
	}

	public static void Mouseover(WebDriver driver, WebElement ele) {
		
		Actions as= new Actions(driver);
		as.moveToElement(ele).perform();
		
	}
	
public static void doubleClick(WebDriver driver,WebElement ele) {
		
		Actions a =new Actions(driver);
		a.doubleClick(ele).perform();
		a.contextClick(ele).perform();
		a.doubleClick(ele).perform();
}
public static void scrollbar(WebDriver driver, int x, int y) {
	JavascriptExecutor J=(JavascriptExecutor)driver;
	J.executeScript("windows.scrollBy("+x+","+y+")");

}

public static void alertpopup(WebDriver driver) {
	Alert a=driver.switchTo().alert();
}

public static void childbrowser(WebDriver driver) {
	String parent= driver.getWindowHandle();
	Set <String> child =driver.getWindowHandles();
	driver.switchTo().window(parent);
	
	/**
	 * ArrayList<String> tabs = new ArrayList<String> (browser.getWindowHandles());
	browser.switchTo().window(tabs.get(index));  can be used for child browser
	 */
}
}




