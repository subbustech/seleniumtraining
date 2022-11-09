package pk05exceloperations;

import java.io.IOException;
import java.util.Map;

import pk06exceloperations.Pr1ExcelCommonFunctions;

public class Pr09ReadingAllDataIntoAMapSeperateClass {

	public static void main(String[] args) throws IOException {

		String path = "./data/sample_xlsx.xlsx";
		String sheetName = "Sheet1";
		
		Map<Integer, Map<String, String>> data = Pr1ExcelCommonFunctions.getData(path, sheetName);
		
		for(int i=1; i<=data.size(); i++) {
			System.out.println("Row "+i+" Data:");
			System.out.println(data.get(i).get("testcase")+" - "+data.get(i).get("firstname")+" - "+data.get(i).get("lastname")+" - "+data.get(i).get("age")+" - "+data.get(i).get("company")+" - "+data.get(i).get("salary")+" - "+data.get(i).get("Manager")+" - "+data.get(i).get("Date of Joining"));
		}
	}
}