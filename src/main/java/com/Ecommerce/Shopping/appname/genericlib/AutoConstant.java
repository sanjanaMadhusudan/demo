/*
 * interface create
 */
package com.Ecommerce.Shopping.appname.genericlib;

/**
 * @author Sanjana
 *
 */
public interface AutoConstant {
/**
     * key and value which are used in system.set property are stored here in variables
	 * Property file path and excel path also remains constant so just store them in  a variable
	 * Screenshots are always stored in a folder, store that path in a variable
 */
	String key="webdriver.chrome.driver";  
	String value="./src/main/resources/chromedriver.exe";
	
	
	String propertyfilepath="./src/test/resources/data.properties";
	String excelfilepath="./src/test/resources/exceldata.xlsx";
	
	
	String photofilepath="./photo/";
	
}
