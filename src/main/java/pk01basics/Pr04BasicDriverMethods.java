package pk01basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pr04BasicDriverMethods {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "servers\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "servers\\IEDriverServer.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		//Basic WebDriver Methods
		//Opening an URL
		driver.get("http://www.google.com");
		
		
		//Getting the title of the page
		System.out.println("Page Title: "+driver.getTitle());
		
		//Get Current URL
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		//Page Source
		//System.out.println("Page Source: "+driver.getPageSource());
		
		//getWindowHandle()
		System.out.println("Window Handle: "+driver.getWindowHandle());
		
		//get WindowHandles()
		System.out.println("Window Handles: "+driver.getWindowHandles());
		
		//Closing Browser
		//driver.close();
		driver.quit();
		
		
	}

}
