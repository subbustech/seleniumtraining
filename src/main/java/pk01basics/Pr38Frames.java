package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr38Frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);
		
		//Switch to child frame
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='frame1']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@id='frfirstname']")).sendKeys("Rajesh");
		
		//Switch to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Suresh");
	}
}
