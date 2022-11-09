package pk05exceloperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr10WriteDataToExcelCreatingNewWorkbook {

	public static void main(String[] args) throws IOException {
		//Create a blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
				
		//Create a blank sheet
		XSSFSheet spreadsheet = workbook.createSheet("Results");
				
		//Create row
		XSSFRow row = spreadsheet.createRow(0);
		
		//Create a cell
		Cell cell0 = row.createCell(0);
		cell0.setCellValue("DB Test");
		
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("Pass");
		
		Cell cell2 = row.createCell(2);
		cell2.setCellValue("UI Test");
		
		Cell cell3 = row.createCell(3);
		cell3.setCellValue("Pass");
		
		FileOutputStream out = new FileOutputStream(new File("./data/testresults.xlsx"));
		workbook.write(out);
	    out.close();
	    workbook.close();

	}

}
