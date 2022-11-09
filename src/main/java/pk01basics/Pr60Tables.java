package pk01basics;

import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Pr60Tables {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "servers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/scrolltable.html");

		Thread.sleep(2000);

		//int noOfRows = driver.findElements(By.xpath("//table[@id='allpaidamounts']/tbody/tr/td[5]")).size();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		//int noOfRows = (Integer) js1.executeScript("return document.evaluate('count(//table[@id=\'allpaidamounts\']/tbody/tr/td[5])', document, null, XPathResult.ANY_TYPE, null).numberValue");
		long noOfRows = (Long) js1.executeScript("return document.evaluate('count(//table[@id=\"allpaidamounts\"]/tbody/tr/td[5])', document, null, XPathResult.ANY_TYPE, null).numberValue");
		double totalAmount = 0.00;

		for(int i=0; i<noOfRows; i++) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//WebElement rowElement = driver.findElements(By.xpath("//table[@id='allpaidamounts']/tbody/tr/td[5]")).get(i);
			System.out.println("document.evaluate('(//table[@id=\"allpaidamounts\"]/tbody/tr/td[5])["+i+"]', document, null, XPathResult.ANY_TYPE, null)");
			WebElement rowElement = (WebElement) js.executeScript("return document.evaluate('(//table[@id=\"allpaidamounts\"]/tbody/tr/td[5])["+i+"]', document, null, XPathResult.ANY_TYPE, null).singleNodeValue");
			js.executeScript("arguments[0].scrollIntoView()", rowElement);

			String amount = driver.findElements(By.xpath("//table[@id='allpaidamounts']/tbody/tr/td[5]")).get(i).getText();

			amount = amount.replace("$", "");
			amount = amount.replace(",", "");
			amount = amount.trim();
			System.out.println(amount);
			totalAmount = totalAmount + Double.parseDouble(amount);
		}

		System.out.println("Total Amount: "+totalAmount);

		String totalAmountPaid = driver.findElement(By.xpath("//span[text()='All Total Paid Amount:']/following-sibling::span")).getText();
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