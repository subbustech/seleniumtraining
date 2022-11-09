package pk05exceloperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr07ReadingAllData {

	public static void main(String[] args) throws IOException {
		//Get access to the workbook
		FileInputStream fis = new FileInputStream("./data/sample_xlsx.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		DataFormatter df = new DataFormatter();

		Iterator<Row> rows = sheet.iterator();
		while(rows.hasNext()) {
			
			//Get the row
			Row row = rows.next();

			//Cell with String value
			Iterator<Cell> cells = row.iterator();
			
			while(cells.hasNext())
			{
				//Get the Cell
				Cell cell = cells.next();
				String cellvalue = df.formatCellValue(cell);
				System.out.println(cellvalue);
			}

		}
		workbook.close();
		fis.close();
	}
}