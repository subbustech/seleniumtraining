package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr18ClickRadioButtonsOnebyOne10Times {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");

		Thread.sleep(2000);

		int no_radio_buttons = driver.findElements(By.xpath("//input[@name='gender']")).size();

		System.out.println("No. of radio buttons are "+no_radio_buttons);

		for(int j=0; j<10; j++) {
			for(int i=0; i<no_radio_buttons; i++) {
				driver.findElements(By.xpath("//input[@name='gender']")).get(i).click();
			}
		}

		Thread.sleep(2000);

		driver.quit();

	}

}