package pk05exceloperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pk02.com.carrental.pages.RegisterLoginPage;
import pk06exceloperations.Pr1ExcelCommonFunctions;

public class Pr12SignUpNewUser {

	public static void main(String[] args) throws IOException, InterruptedException {

		String path = "./data/newuserdata.xlsx";
		String sheetName = "Sheet1";

		Map<Integer, Map<String, String>> data = Pr1ExcelCommonFunctions.getData(path, sheetName);

		System.out.println(data);
		
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");

		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);

		for(int i=0; i<data.size(); i++) {
			
			registerLoginPage.returnLoginOrRegisterButton().click();

			WebDriverWait d=new WebDriverWait(driver,20);
			d.until(ExpectedConditions.elementToBeClickable(registerLoginPage.returnSignUpLink()));

			registerLoginPage.returnSignUpLink().click();
			Thread.sleep(2000);
			
			registerLoginPage.returnFullNameTextBox().clear();
			registerLoginPage.returnFullNameTextBox().sendKeys(data.get(i+1).get("fullname"));

			registerLoginPage.returnMobileNoTextBox().clear();
			registerLoginPage.returnMobileNoTextBox().sendKeys(data.get(i+1).get("mobileno"));

			registerLoginPage.returnEmailIdTextBox().clear();
			registerLoginPage.returnEmailIdTextBox().sendKeys(data.get(i+1).get("emailid"));
			registerLoginPage.returnEmailIdTextBox().sendKeys(Keys.TAB);

			String emailAvailableMsg = registerLoginPage.returnUserAvailabilityMessage().getText();
			
			String successMsg = null;

			if(emailAvailableMsg.equalsIgnoreCase("Email available for Registration .")) {
				
				registerLoginPage.returnPasswordTextBox().clear();
				registerLoginPage.returnPasswordTextBox().sendKeys(data.get(i+1).get("password"));

				registerLoginPage.returnConfirmPasswordTextBox().clear();
				registerLoginPage.returnConfirmPasswordTextBox().sendKeys(data.get(i+1).get("password"));

				registerLoginPage.returnSignUpButton().click();

				driver.switchTo().alert().dismiss();
				
				successMsg = "Registration Successful";

			}
			else {
				
				successMsg = "Registration Not Successful.";
				
				registerLoginPage.returnSignUpCloseButton().click();
				
			}
			
			FileInputStream fis = new FileInputStream("./data/newuserdata.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			//Get the sheet you want
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			Row rowtoput = sheet.getRow(i+1);
			Cell celltoput = rowtoput.createCell(4);
			celltoput.setCellValue(successMsg);

			FileOutputStream fos = new FileOutputStream("data/newuserdata.xlsx");
			workbook.write(fos);
			fos.close();
			workbook.close();
			fis.close();
			
		}

	}

}