package pk01basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr55SelectingAValueFromAutoSuggest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hyde");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		String oldvalue = "";
		String ourvalue = "Hyderabad Airport";
		for(int i=0; ;i++) {
			
			if(i==0) {
				driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
				driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.UP);
			}
			else {
				driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
			}
			String placevalue = "return document.getElementById('src').value;";
			String value = (String) js.executeScript(placevalue);
			if(value.equalsIgnoreCase(ourvalue)) {
				driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ENTER);
				break;
			}
			else if(value.equalsIgnoreCase(oldvalue)) {
				System.out.println("Sorry! The value you are looking for is not present.");
				break;
			}
			else {
				System.out.println(value);
				oldvalue = value;
			}
		}
	}
}