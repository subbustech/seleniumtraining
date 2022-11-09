package pk07log4j2.pk1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pk02.com.carrental.pages.NavigationBarWithConstructor;

// Use log4j2_2.xml
public class Pr01NavigationBarCheckWithPOM {

	private static Logger log = LogManager.getLogger(Pr01NavigationBarCheckWithPOM.class.getName());
	
	public static void main(String[] args) {

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
			log.trace("This is trace message");
		}
		else {
			System.out.println("Home link is Not present in navigation bar");
		}

		if(isAboutUsLinkDisplayed) {
			System.out.println("About Us link is present in navigation bar");
			log.debug("This is debug message");
		}
		else {
			System.out.println("About Us link is Not present in navigation bar");
		}

		if(isCarListingLinkDisplayed) {
			System.out.println("Car Listing link is present in navigation bar");
			log.info("This is info message");
		}
		else {
			System.out.println("Car Listing link is Not present in navigation bar");
		}

		if(isFaqsLinkDisplayed) {
			System.out.println("FAQs link is present in navigation bar");
			log.warn("This is warn message");
		}
		else {
			System.out.println("FAQs link is Not present in navigation bar");
		}

		if(isContactUsLinkDisplayed) {
			System.out.println("Contact Us link is present in navigation bar");
			log.error("This is error message");
			log.fatal("This is fatal message");
		}
		else {
			System.out.println("Contact Us link is Not present in navigation bar");
		}
		
		driver.quit();
	}

}
