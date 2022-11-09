package pk10testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pr01VerifyPagesHelperAttributes {

	@Test
	public void verifyHomePage() {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		boolean header1 = driver.findElement(By.xpath("//h2[contains(text(),'Find the Best') and span[contains(text(),'CarForYou')]]")).isDisplayed();
		
		if(header1) {
			System.out.println("Home Page is verified successfully");
		}
		else {
			System.out.println("Home Page can't be verified");
		}
		
		driver.close();
	}
	
	@Test(dependsOnMethods={"verifyHomePage"})
	public void verifyAboutUsPage() {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();
		
		boolean header1 = driver.findElement(By.xpath("//h2[contains(text(),'About Us')]")).isDisplayed();
		
		if(header1) {
			System.out.println("About Us Page is verified successfully");
		}
		else {
			System.out.println("About Us Page can't be verified");
		}
		
		driver.close();
	}
	
	@Test(enabled=false)
	public void verifyCarListingPage() {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		driver.findElement(By.xpath("//a[text()='Car Listing']")).click();
		
		boolean header1 = driver.findElement(By.xpath("//h1[text()='Car Listing']")).isDisplayed();
		
		if(header1) {
			System.out.println("Car Listing Page is verified successfully");
		}
		else {
			System.out.println("Car Listing Page can't be verified");
		}
		
		driver.close();
	}
	
	@Test
	public void verifyFAQsPage() {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		driver.findElement(By.xpath("(//a[text()='FAQs'])[1]")).click();
		
		boolean header1 = driver.findElement(By.xpath("//h1[text()='FAQs']")).isDisplayed();
		
		if(header1) {
			System.out.println("FAQs Page is verified successfully");
		}
		else {
			System.out.println("FAQs Page can't be verified");
		}
		
		driver.close();
	}
	
	@Test
	public void verifyContactUsPage() {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
		
		boolean header1 = driver.findElement(By.xpath("//h1[text()='Contact Us']")).isDisplayed();
		
		if(header1) {
			System.out.println("Contact Us Page is verified successfully");
		}
		else {
			System.out.println("Contact Us Page can't be verified");
		}
		
		driver.close();
	}
	
	
}
