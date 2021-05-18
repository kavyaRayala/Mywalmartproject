package com.walmart.qa.util;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	import com.walmart.qa.base.TestBase;

	public class TestUtil extends TestBase{
		public static long PAGE_LOAD_TIMEOUT=120;
		public static long IMPLICIT_WAIT=60;
		public static String TEST_SHEET_PATH = "C:\\Users\\lenovo\\eclipse-workspace\\onlineshopping\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCrmtestdata.xlsx";
		static Workbook book;
		static  Sheet sheet;
		public static Object [][] getTestdata(String sheetName) {
			 FileInputStream file=null;
			 try {
				 file= new FileInputStream(TEST_SHEET_PATH);
			 }catch (FileNotFoundException e) {
				 e.printStackTrace();
			 }
						try {
							book= WorkbookFactory.create(file);
			               }catch (InvalidFormatException e) {
							e.printStackTrace();
						}catch (IOException e) {
							e.printStackTrace();
						}
				 sheet= book.getSheet(sheetName);
				 Object [][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
				 for (int i=0;i< sheet.getLastRowNum();i++) {
					 for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
						 data[i][k]=sheet.getRow(i + 1).getCell(k).toString();
					 }
					 }
					 return data;
			 }

		public static void takeScreenshotAtEndOfTest() {
			// TODO Auto-generated method stub
			
		}
		}
