package Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class ExcelReader {
	public static void main(String[] args)throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\ADMIN\\Downloads\\ExcelImportSelenium.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		
		
		System.out.println(sheet.getRow(0).getCell(1));
		
		System.out.println(sheet.getRow(1).getCell(0));		
		System.out.println(sheet.getRow(1).getCell(1));		
		
		System.out.println(sheet.getRow(2).getCell(0));		
		System.out.println(sheet.getRow(2).getCell(1));	
	
	}

}
