package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pr57Tables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/tables.html");

		Thread.sleep(2000);

		int noOfRows = driver.findElements(By.xpath("//table[@id='paidamounts']/tbody/tr/td[5]")).size();

		double totalAmount = 0.00;
		
		for(int i=0; i<noOfRows; i++) {
			String amount = driver.findElements(By.xpath("//table[@id='paidamounts']/tbody/tr/td[5]")).get(i).getText();
			amount = amount.replace("$", "");
			amount = amount.replace(",", "");
			amount = amount.trim();
			System.out.println(amount);
			totalAmount = totalAmount + Double.parseDouble(amount);
		}
		
		System.out.println("Total Amount: "+totalAmount);
		
		String totalAmountPaid = driver.findElement(By.xpath("//span[text()='Total Paid Amount:']/following-sibling::span")).getText();
		totalAmountPaid = totalAmountPaid.replace("$", "");
		totalAmountPaid = totalAmountPaid.replace(",", "");
		totalAmountPaid = totalAmountPaid.trim();
		
		double totalAmountPaidFromScreen = Double.parseDouble(totalAmountPaid);
		
		if(totalAmountPaidFromScreen == totalAmount) {
			System.out.println("Amounts are equal");
		}
		else {
			System.out.println("Amounts are not equal");
		}
		
	}
}