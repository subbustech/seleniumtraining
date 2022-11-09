package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pr21SelectingaValueFromDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");

		Thread.sleep(2000);

		Select s = new Select(driver.findElement(By.xpath("//select[@id='cars_single_selection']")));
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("mercedes");
		Thread.sleep(2000);
		s.selectByVisibleText("Audi 1");
		Thread.sleep(2000);

		driver.quit();

	}

}