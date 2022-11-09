package pk05exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr04ReadingDataFromACell {

	public static void main(String[] args) throws IOException {
		//Get access to the workbook
		FileInputStream fis = new FileInputStream("./data/sample_xlsx.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		//Get a row number
		Row row = sheet.getRow(1);

		//Cell with String value
		Cell cell1 = row.getCell(1);
		System.out.println(cell1.getStringCellValue());

		//Cell with integer value
		Cell cell3 = row.getCell(3);
		System.out.println(cell3.getNumericCellValue());
		
		//Cell with boolean value
		Cell cell6 = row.getCell(6);
		System.out.println(cell6.getBooleanCellValue());
		
		//Cell with Date value
		Cell cell7 = row.getCell(7);
		System.out.println(cell7.getDateCellValue());
		
		workbook.close();
	}
}