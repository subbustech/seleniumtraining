package pk05exceloperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr11WriteDataToExcelExistingWorkbook {

	public static void main(String[] args) throws IOException {

		//Get access to the workbook
		FileInputStream fis = new FileInputStream("./data/resources.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		//Get a row number
		Row row = sheet.getRow(0);

		DataFormatter df = new DataFormatter();

		int actualcol = 0;
		boolean colfound = false;

		//Cell with String value
		Iterator<Cell> cells = row.iterator();
		while(cells.hasNext()) {
			Cell cell = cells.next();
			String cellvalue = df.formatCellValue(cell);

			if(cellvalue.equalsIgnoreCase("salary")) {
				actualcol = cell.getColumnIndex();
				colfound = true;
			}

			if(colfound) {
				break;
			}
		}

		fis.close();

		//Get access to the workbook
		FileOutputStream fos = new FileOutputStream("data/resources.xlsx");

		Row rowtoput = sheet.getRow(1);
		Cell celltoput = rowtoput.createCell(actualcol);
		celltoput.setCellValue("1000");

		workbook.write(fos);
		fos.close();
		workbook.close();
	}


}
