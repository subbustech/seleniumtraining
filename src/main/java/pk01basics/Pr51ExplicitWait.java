package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pr51ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		
		driver.findElement(By.xpath("//button[@id='dispdynbutton']")).click();
		
		//Explicit wait
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.id("delayedbutton")));

		driver.findElement(By.xpath("//button[@id='delayedbutton']")).click();

		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
	}
}