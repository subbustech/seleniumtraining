package pk01basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr22GettingAllValuesAndVisibleTextFromDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");

		Thread.sleep(2000);

		List<WebElement> li = driver.findElements(By.xpath("//select[@id='cars_single_selection']/option"));
		int count = li.size();
		for(int i=0; i<count; i++) {
			System.out.println("Value Attribute: "+li.get(i).getAttribute("value")+" <--> "+"Visible Text: "+li.get(i).getText());
		}
		
		driver.quit();

	}

}