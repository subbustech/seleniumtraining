package pk05exceloperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr06ReadingDataFromAnEntireRow {

	public static void main(String[] args) throws IOException {
		//Get access to the workbook
		FileInputStream fis = new FileInputStream("./data/sample_xlsx.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		//Get a row number
		Row row = sheet.getRow(1);

		DataFormatter df = new DataFormatter();
		
		//Cell with String value
		Iterator<Cell> it = row.iterator();
		while(it.hasNext())
		{
			//Get the Cell
			Cell cell = it.next();
			String cellvalue = df.formatCellValue(cell);
			System.out.println(cellvalue);
		}

		
		workbook.close();
		fis.close();
	}
}