package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr29ActionsClassDragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");

		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='dvSource']/img[1]"));
		WebElement target = driver.findElement(By.id("dvDest"));
		
		Thread.sleep(2000);
		
		a.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}