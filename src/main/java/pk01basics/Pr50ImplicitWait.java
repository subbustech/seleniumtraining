package pk01basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr50ImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		
		driver.findElement(By.xpath("//button[@id='delayedbutton']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();

	}
}