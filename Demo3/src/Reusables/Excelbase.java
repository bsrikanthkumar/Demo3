package Reusables;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelbase 
{
		public static File F;
		public static FileInputStream fis;
		public static XSSFWorkbook workbook;
		public static XSSFSheet sheet;
		public static XSSFRow Row;
		public static XSSFCell cell;

		public static int getTotalRows(String FileName, String SheetName) throws Exception
		{
			F = new File(FileName);
			fis = new FileInputStream(F);

			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(SheetName);
			
			int rowCount = sheet.getLastRowNum();
			return rowCount;
		}
		public static int getTotalCols(String FileName, String SheetName, int rowNum) throws Exception
		{
			F = new File(FileName);
			fis = new FileInputStream(F);

			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(SheetName);
			
			int colCount = sheet.getRow(rowNum).getLastCellNum();
			return colCount;
		}
		public static String getCellData(String FileName, String SheetName, int rowNum, int cellNum) throws Exception
		{
			F = new File(FileName);
			fis = new FileInputStream(F);

			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(SheetName);
			
			String data = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
			return data;
		}
		public static Object[][] getData(String FileName,String SheetName) throws Exception
		{
			F=new File(FileName);
			fis=new FileInputStream(F);
			
			//XSSF Files
			workbook = new XSSFWorkbook(fis);
			
			sheet=workbook.getSheet(SheetName);
			
			int totalRows = getTotalRows(FileName,SheetName);
			
			int totalCols = getTotalCols(FileName,SheetName,1);
			
			Object[][] data = new Object[totalRows][totalCols];
			
			for(int rowNumber=1; rowNumber<=totalRows; rowNumber++)
			{
				for(int colNum=0; colNum<totalCols; colNum++)
				{
					data[rowNumber-1][colNum] = getCellData(FileName,SheetName,rowNumber,colNum);
									
				}
			}
			return data;
		}
	}