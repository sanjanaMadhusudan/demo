package com.Ecommerce.Shopping.appname.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author sanjana 
 *
 */
public class PropertyFile implements AutoConstant{
	
	/**@param propKey
	 * @return 
	 * @throws IOException
	 */
	public static  String readpropertyfile(String propertykey) throws IOException {
		
		Properties p=new Properties();
		FileInputStream f=new FileInputStream(propertyfilepath);
		p.load(f);
		String propertyValue=p.getProperty(propertykey);
		return propertyValue;
		
		
	}
	

}
