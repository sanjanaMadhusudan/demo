/**
 * 
 */
package com.Ecommerce.Shopping.appname.genericlib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Madhusudan
 *
 */
public class Exceldata implements AutoConstant {
	/**Read data from excel sheet
	 * @param sheetName
 * @param rownum
 * @param cellnum
 * @return
 * @throws EncryptedDocumentException
 * @throws InvalidFormatException
 * @throws IOException
	 * 
	 */

	
public static String readExcel(String sheetName, int rownum, int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream f=new FileInputStream(excelfilepath);
		Workbook wb= WorkbookFactory.create(f);
		
		String excelValue=wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		
		return excelValue;

}
}