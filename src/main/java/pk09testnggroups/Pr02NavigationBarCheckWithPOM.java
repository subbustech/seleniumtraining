package pk09testnggroups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pk02.com.carrental.pages.NavigationBarWithConstructor;

public class Pr02NavigationBarCheckWithPOM {

	@Test(groups={"smoke"})
	public void checkNavigationBarLinks() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		NavigationBarWithConstructor navigationBar = new NavigationBarWithConstructor(driver);

		driver.get("http://localhost/carrental");

		boolean isHomeLinkDisplayed = navigationBar.returnHomeLink().isDisplayed();

		boolean isAboutUsLinkDisplayed = navigationBar.returnAboutUsLink().isDisplayed();

		boolean isCarListingLinkDisplayed = navigationBar.returnCarListingLink().isDisplayed();

		boolean isFaqsLinkDisplayed = navigationBar.returnFaqsLink().isDisplayed();

		boolean isContactUsLinkDisplayed = navigationBar.returnContactUsLink().isDisplayed();

		if(isHomeLinkDisplayed) {
			System.out.println("Home link is present in navigation bar");
		}
		else {
			System.out.println("Home link is Not present in navigation bar");
		}

		if(isAboutUsLinkDisplayed) {
			System.out.println("About Us link is present in navigation bar");
		}
		else {
			System.out.println("About Us link is Not present in navigation bar");
		}

		if(isCarListingLinkDisplayed) {
			System.out.println("Car Listing link is present in navigation bar");
		}
		else {
			System.out.println("Car Listing link is Not present in navigation bar");
		}

		if(isFaqsLinkDisplayed) {
			System.out.println("FAQs link is present in navigation bar");
		}
		else {
			System.out.println("FAQs link is Not present in navigation bar");
		}

		if(isContactUsLinkDisplayed) {
			System.out.println("Contact Us link is present in navigation bar");
		}
		else {
			System.out.println("Contact Us link is Not present in navigation bar");
		}
		
		driver.quit();
	}

	@Test
	public void searchMaruthi() {
		
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		NavigationBarWithConstructor navigationBar = new NavigationBarWithConstructor(driver);

		driver.get("http://localhost/carrental");
		
		navigationBar.returnSearchTextBox().sendKeys("Maruti");
		
		navigationBar.returnSearchTextBox().sendKeys(Keys.ENTER);
		
		int noOfVehicles = driver.findElements(By.xpath("//div[contains(@class,'product-listing-m gray-bg')]")).size();
		
		for(int i=1; i<=noOfVehicles; i++) {
			String vehicleName = driver.findElement(By.xpath("(//div[contains(@class,'product-listing-m gray-bg')])["+i+"]//h5/a")).getText();
			System.out.println("Vehicle is "+vehicleName);
		}
		
		driver.quit();
	}
	
	@Test
	public void searchBMW() {
		
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		NavigationBarWithConstructor navigationBar = new NavigationBarWithConstructor(driver);

		driver.get("http://localhost/carrental");
		
		navigationBar.returnSearchTextBox().sendKeys("BMW");
		
		navigationBar.returnSearchTextBox().sendKeys(Keys.ENTER);
		
		int noOfVehicles = driver.findElements(By.xpath("//div[contains(@class,'product-listing-m gray-bg')]")).size();
		
		for(int i=1; i<=noOfVehicles; i++) {
			String vehicleName = driver.findElement(By.xpath("(//div[contains(@class,'product-listing-m gray-bg')])["+i+"]//h5/a")).getText();
			System.out.println("Vehicle is "+vehicleName);
		}
		
		driver.quit();
	}
	
	@Test
	public void searchAudi() {
		
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		NavigationBarWithConstructor navigationBar = new NavigationBarWithConstructor(driver);

		driver.get("http://localhost/carrental");
		
		navigationBar.returnSearchTextBox().sendKeys("Audi");
		
		navigationBar.returnSearchTextBox().sendKeys(Keys.ENTER);
		
		int noOfVehicles = driver.findElements(By.xpath("//div[contains(@class,'product-listing-m gray-bg')]")).size();
		
		for(int i=1; i<=noOfVehicles; i++) {
			String vehicleName = driver.findElement(By.xpath("(//div[contains(@class,'product-listing-m gray-bg')])["+i+"]//h5/a")).getText();
			System.out.println("Vehicle is "+vehicleName);
		}
		
		driver.quit();
	}
	
	@Test
	public void searchNissan() {
		
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		NavigationBarWithConstructor navigationBar = new NavigationBarWithConstructor(driver);

		driver.get("http://localhost/carrental");
		
		navigationBar.returnSearchTextBox().sendKeys("Nissan");
		
		navigationBar.returnSearchTextBox().sendKeys(Keys.ENTER);
		
		int noOfVehicles = driver.findElements(By.xpath("//div[contains(@class,'product-listing-m gray-bg')]")).size();
		
		for(int i=1; i<=noOfVehicles; i++) {
			String vehicleName = driver.findElement(By.xpath("(//div[contains(@class,'product-listing-m gray-bg')])["+i+"]//h5/a")).getText();
			System.out.println("Vehicle is "+vehicleName);
		}
		
		driver.quit();
	}
	
	@Test
	public void searchToyota() {
		
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		NavigationBarWithConstructor navigationBar = new NavigationBarWithConstructor(driver);

		driver.get("http://localhost/carrental");
		
		navigationBar.returnSearchTextBox().sendKeys("Toyota");
		
		navigationBar.returnSearchTextBox().sendKeys(Keys.ENTER);
		
		int noOfVehicles = driver.findElements(By.xpath("//div[contains(@class,'product-listing-m gray-bg')]")).size();
		
		for(int i=1; i<=noOfVehicles; i++) {
			String vehicleName = driver.findElement(By.xpath("(//div[contains(@class,'product-listing-m gray-bg')])["+i+"]//h5/a")).getText();
			System.out.println("Vehicle is "+vehicleName);
		}
		
		driver.quit();
	}

}
