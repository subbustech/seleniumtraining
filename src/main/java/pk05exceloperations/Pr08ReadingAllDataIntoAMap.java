package pk05exceloperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr08ReadingAllDataIntoAMap {

	public static void main(String[] args) throws IOException {

		Map<Integer,Map<String,String>> data = new LinkedHashMap<Integer,Map<String,String>>();

		//Get access to the workbook
		FileInputStream fis = new FileInputStream("./data/sample_xlsx.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		DataFormatter df = new DataFormatter();

		Iterator<Row> rows = sheet.iterator();

		int rowNo = 0;
		while(rows.hasNext()) {

			//Get the row
			Row row = rows.next();

			//Cell with String value
			Iterator<Cell> cells = row.iterator();
			
			if(rowNo != 0) {
				Map<String, String> eachRowData = new LinkedHashMap<String,String>();
				int cellNo = 0;
				while(cells.hasNext())
				{
					//Get the Cell
					Cell cell = cells.next();
					String cellvalue = df.formatCellValue(cell);
					eachRowData.put(df.formatCellValue(sheet.getRow(0).getCell(cellNo)), cellvalue);
					cellNo++;
				}
				data.put(rowNo, eachRowData);
			}
			rowNo++;
		}
		workbook.close();
		fis.close();
		
		for(int i=1; i<=data.size(); i++) {
			System.out.println("Row "+i+" Data:");
			System.out.println(data.get(i));
		}
		
		for(int i=1; i<=data.size(); i++) {
			System.out.println("Row "+i+" Data:");
			System.out.println(data.get(i).get("testcase")+" - "+data.get(i).get("firstname")+" - "+data.get(i).get("lastname")+" - "+data.get(i).get("age")+" - "+data.get(i).get("company")+" - "+data.get(i).get("salary")+" - "+data.get(i).get("Manager")+" - "+data.get(i).get("Date of Joining"));
		}
	}
}