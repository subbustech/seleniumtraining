package pk05exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Pr02Basics_XLS {

	public static void main(String[] args) throws IOException {
		//Get access to the workbook
		FileInputStream fis = new FileInputStream("./data/sample_xls.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);

		//Get the sheet you want
		HSSFSheet sheet = workbook.getSheet("Sheet1");

		//Get a row number
		Row row = sheet.getRow(1);

		//Get a cell number
		Cell cell = row.getCell(1);

		//Get that cell value
		System.out.println(cell.getStringCellValue());

		workbook.close();


	}

}
