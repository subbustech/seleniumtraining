package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr39Frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);
		
		//Switch to frame1
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='frameinframe1']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@id='frinfr1firstname']")).sendKeys("Rajesh");
		
		//Switch to frame2
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@name='frameinfrme2']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@id='frinfr2firstname']")).sendKeys("Suresh");
		
		//Switch to frame3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@name='frameinframe3']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@id='frinfr3firstname']")).sendKeys("Ganesh");
		
		
		//Switch to parent frame
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Suresh");
	}
}
