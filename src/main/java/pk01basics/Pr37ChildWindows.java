package pk01basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr37ChildWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);
		
		//Switching to Child Window 1
		String mainWindowHandle = driver.getWindowHandle();
		
		By element1 = By.xpath("//a[text()='Child Window 1']");
		
		String childWindow1 = getChildWindow(driver, element1);
		
		driver.switchTo().window(childWindow1);
		Thread.sleep(2000);
		
		//Switching to Child Window 2
		By element2 = By.xpath("//a[text()='Child Window 2']");
		
		String childWindow2 = getChildWindow(driver, element2);
		
		driver.switchTo().window(childWindow2);
		Thread.sleep(2000);
		
		//Switching to Child Window 3
		
		By element3 = By.xpath("//a[text()='Child Window 3']");
		
		String childWindow3 = getChildWindow(driver, element3);
				
		driver.switchTo().window(childWindow3);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='cw3firstname']")).sendKeys("Child Window 3");
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(childWindow2);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cw2firstname']")).sendKeys("Child Window 2");
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(childWindow1);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cw1firstname']")).sendKeys("Child Window 1");
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(mainWindowHandle);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Parent Window");
	}

	public static String getChildWindow(WebDriver driver, By element) {
		
		Set<String> allWindowHandlesBefore = driver.getWindowHandles();
		
		driver.findElement(element).click();
				
		Set<String> allWindowHandlesAFter = driver.getWindowHandles();
				
		allWindowHandlesAFter.removeAll(allWindowHandlesBefore);
				
		String childWindow = allWindowHandlesAFter.iterator().next();
		
		return childWindow;
		
	}
}
