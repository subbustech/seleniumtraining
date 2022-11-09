package pk01basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr35ChildWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);
		
		String mainWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Child Window 1']")).click();
		
		Set<String> allWindowHandlesCW1 = driver.getWindowHandles();
		
		allWindowHandlesCW1.remove(mainWindowHandle);
		
//		List<String> cw1ChildWindow = new ArrayList<String>(allWindowHandlesCW1);
//		
//		String childWindow1 = cw1ChildWindow.get(0); 
		
//		String childWindow1 = null;
//		for(String cw1ChildWindow:allWindowHandlesCW1) {
//			childWindow1 = cw1ChildWindow;
//		}
		
//		String childWindow1 = null;
//		Iterator<String> it = allWindowHandlesCW1.iterator();
//		while(it.hasNext()) {
//			childWindow1 = it.next();
//		}
		
//		Iterator<String> it = allWindowHandlesCW1.iterator();
//		String childWindow1 = it.next();
		
		String childWindow1 = allWindowHandlesCW1.iterator().next();
		
		driver.switchTo().window(childWindow1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='cw1firstname']")).sendKeys("Child Window 1");
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(mainWindowHandle);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Parent Window");
	}

}
