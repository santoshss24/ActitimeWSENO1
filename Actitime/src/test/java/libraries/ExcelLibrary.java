package libraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary 
{
	public static Object[][] getData(String path,String sheetname)
	{
		
		Workbook wb = null;
		try {
			FileInputStream fin=new FileInputStream(path);
			wb = WorkbookFactory.create(fin);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet(sheetname);
		
		Object [][]arr=new Object[sheet.getPhysicalNumberOfRows()][2];
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
				
				arr[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return arr;
	}
	
	
	public static String getValue(String path,String sheetname, int r, int c) 
	{
		FileInputStream fin;
		Workbook wb = null;
		try {
			
			fin = new FileInputStream(path);
			wb = WorkbookFactory.create(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Sheet sheet=wb.getSheet(sheetname);
		
		String value = sheet.getRow(r).getCell(c).getStringCellValue();
	
		return value;
	}

}
