package pk01basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr36ChildWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);
		
		//Switching to Child Window 1
		String mainWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Child Window 1']")).click();
		
		Set<String> allWindowHandlesCW1 = driver.getWindowHandles();
		
		allWindowHandlesCW1.remove(mainWindowHandle);
		
		String childWindow1 = allWindowHandlesCW1.iterator().next();
		
		driver.switchTo().window(childWindow1);
		Thread.sleep(2000);
		
		//Switching to Child Window 2
		allWindowHandlesCW1 = driver.getWindowHandles();
		
		driver.findElement(By.xpath("//a[text()='Child Window 2']")).click();
		
		Set<String> allWindowHandlesCW2 = driver.getWindowHandles();
		
		allWindowHandlesCW2.removeAll(allWindowHandlesCW1);
		
		String childWindow2 = allWindowHandlesCW2.iterator().next();
		
		driver.switchTo().window(childWindow2);
		Thread.sleep(2000);
		
		//Switching to Child Window 3
		allWindowHandlesCW2 = driver.getWindowHandles();
		
		driver.findElement(By.xpath("//a[text()='Child Window 3']")).click();
				
		Set<String> allWindowHandlesCW3 = driver.getWindowHandles();
				
		allWindowHandlesCW3.removeAll(allWindowHandlesCW2);
				
		String childWindow3 = allWindowHandlesCW3.iterator().next();
				
		driver.switchTo().window(childWindow3);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='cw3firstname']")).sendKeys("Child Window 3");
		Thread.sleep(2000);
	
		driver.close();
		driver.switchTo().window(childWindow2);
		
		driver.findElement(By.xpath("//input[@id='cw2firstname']")).sendKeys("Child Window 2");
		Thread.sleep(2000);
		
		driver.close();
		driver.switchTo().window(childWindow1);
		
		driver.findElement(By.xpath("//input[@id='cw1firstname']")).sendKeys("Child Window 1");
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(mainWindowHandle);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Parent Window");
	}

}
