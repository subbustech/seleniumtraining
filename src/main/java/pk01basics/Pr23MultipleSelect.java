package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pr23MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");

		Thread.sleep(2000);

		//Creating a select object
		Select s = new Select(driver.findElement(By.xpath("//select[@name='cars_multi_selection']")));

		//Selecting an option by index
		s.selectByIndex(1);
		Thread.sleep(2000);

		//Selecting an object by value
		s.selectByValue("fiat");
		Thread.sleep(2000);

		//Selecting an object by visible text
		s.selectByVisibleText("Audi 1");
		Thread.sleep(2000);

		//deselecting by index
		s.deselectByIndex(1);
		Thread.sleep(2000);

		//deselecting by value
		s.deselectByValue("fiat");
		Thread.sleep(2000);

		//deselecting by visible text
		s.deselectByVisibleText("Audi 1");
		Thread.sleep(2000);

		//deselecting all elements
		s.selectByIndex(1);
		s.selectByValue("fiat");
		s.selectByVisibleText("Audi 1");
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);

		driver.quit();

	}
}