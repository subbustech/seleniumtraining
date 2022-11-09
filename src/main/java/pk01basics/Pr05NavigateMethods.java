package pk01basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pr05NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "servers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//Opening an URL
		driver.get("http://www.google.com");
		
		Thread.sleep(2000);
		
		//Navigating to a different URL
		driver.navigate().to("http://www.rediff.com");
		
		Thread.sleep(2000);
		
		//Navigating back
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//Navigating forward
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		//Refreshing a page
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		//Closing Browser
		driver.close();
	}

}
