/**
 * 
 */
package com.shopping.appname.textcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Ecommerce.Shopping.appname.genericlib.BaseTest;
import com.Ecommerce.Shopping.appname.genericlib.PropertyFile;
import com.Ecommerce.Shopping.appname.pompages.Login;

/**
 * @author Madhusudan
 *
 */
public class loginaction  extends BaseTest{
	@Test
	public void logging() throws IOException, InterruptedException {
		Login l=new Login(driver);
		Thread.sleep(3000);
		l.logindetails(PropertyFile.readpropertyfile("username"),PropertyFile.readpropertyfile("password"));
		
	}
	
	
	

}
