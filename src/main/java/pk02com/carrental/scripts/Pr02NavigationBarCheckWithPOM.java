package pk02com.carrental.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pk02.com.carrental.pages.NavigationBarWithOutConstructor;

public class Pr02NavigationBarCheckWithPOM {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		NavigationBarWithOutConstructor navigationBar = new NavigationBarWithOutConstructor();
		
		driver.get("http://localhost/carrental");
		
		boolean isHomeLinkDisplayed = navigationBar.returnHomeLink(driver).isDisplayed();
		
		boolean isAboutUsLinkDisplayed = navigationBar.returnAboutUsLink(driver).isDisplayed();
		
		boolean isCarListingLinkDisplayed = navigationBar.returnCarListingLink(driver).isDisplayed();
		
		boolean isFaqsLinkDisplayed = navigationBar.returnFaqsLink(driver).isDisplayed();
		
		boolean isContactUsLinkDisplayed = navigationBar.returnContactUsLink(driver).isDisplayed();
		
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
	}

}
