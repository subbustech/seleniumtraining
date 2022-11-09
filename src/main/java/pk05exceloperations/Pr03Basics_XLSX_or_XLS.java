package pk05exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr03Basics_XLSX_or_XLS {

	public static void main(String[] args) throws IOException {

		String dataSheetPath = "./data/sample_xlsx.xlsx";

		String ext1 = FilenameUtils.getExtension(dataSheetPath);
		FileInputStream fis = new FileInputStream(dataSheetPath);

		Workbook workbook = null;
		Sheet sheet = null;

		if(ext1.equalsIgnoreCase("xlsx")){
			//Get access to the workbook
			workbook = new XSSFWorkbook(fis);
			//Get the sheet you want
			sheet = workbook.getSheet("Sheet1");
		}
		else if(ext1.equalsIgnoreCase("xls")){
			//Get access to the workbook
			workbook = new HSSFWorkbook(fis);

			//Get the sheet you want
			sheet = workbook.getSheet("Sheet1");
		}

		//Get a row number
		Row row = sheet.getRow(1);

		//Get a cell number
		Cell cell = row.getCell(1);

		//Get that cell value
		System.out.println(cell.getStringCellValue());

		workbook.close();

	}

}