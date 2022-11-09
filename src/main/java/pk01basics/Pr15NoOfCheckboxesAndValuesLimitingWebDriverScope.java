package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr15NoOfCheckboxesAndValuesLimitingWebDriverScope {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);

		int no_check_boxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size();

		System.out.println("No. of checkboxes are "+no_check_boxes);

		for(int i=0; i<no_check_boxes; i++) {
			String cbvalue = driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("value");
			System.out.println(cbvalue);
		}

		System.out.println("----------------------------------------------");
		WebElement cbdriver = driver.findElement(By.id("cbgroup1"));

		int no_check_boxes_group1 = cbdriver.findElements(By.xpath(".//input[@type='checkbox']")).size();

		System.out.println("No. of checkboxes are "+no_check_boxes_group1);

		for(int i=0; i<no_check_boxes_group1; i++) {
			String cbvalue = cbdriver.findElements(By.xpath(".//input[@type='checkbox']")).get(i).getAttribute("value");
			System.out.println(cbvalue);
		}

		driver.quit();
	}

}
