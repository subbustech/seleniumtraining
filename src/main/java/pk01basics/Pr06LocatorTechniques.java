package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr06LocatorTechniques {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);

		//find by id
		driver.findElement(By.id("firstname")).sendKeys("By id");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).clear();
		Thread.sleep(2000);

		//find by name
		driver.findElement(By.name("firstname")).sendKeys("By name");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).clear();
		Thread.sleep(2000);

		//find by className
		driver.findElement(By.className("beautifultextbox")).sendKeys("By class name");
		Thread.sleep(2000);
		driver.findElement(By.className("beautifultextbox")).clear();
		Thread.sleep(2000);

		//find element by tagName
		driver.findElement(By.tagName("input")).sendKeys("By tag name");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(2000);

		//find element by linkText
		driver.findElement(By.linkText("google the top search engine")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		//find element by linkText
		driver.findElement(By.linkText("rediff")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		//find element by partialLinkText
		driver.findElement(By.partialLinkText("top search engine")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		//find element by xpath
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("By xpath");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		Thread.sleep(2000);

		//find element by cssSelector
		driver.findElement(By.cssSelector("input[id='firstname']")).sendKeys("By css selector");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='firstname']")).clear();
		Thread.sleep(2000);

		driver.close();
	}
}