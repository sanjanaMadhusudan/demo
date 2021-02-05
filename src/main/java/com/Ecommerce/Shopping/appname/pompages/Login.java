
package com.Ecommerce.Shopping.appname.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Madhusudan
 *
 */
public class Login {

	@FindBy(id="username")
	private WebElement usernametb; 
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbutton;
	

	
public Login(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}
public void logindetails(String username, String password) throws InterruptedException {

	usernametb.sendKeys(username); 
	passwordtb.sendKeys(password); 
	Thread.sleep(3000); 
	loginbutton.click();
	Thread.sleep(3000); 
}
}

