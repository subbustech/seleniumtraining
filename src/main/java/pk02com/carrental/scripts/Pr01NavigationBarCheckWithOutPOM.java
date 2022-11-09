package pk02com.carrental.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr01NavigationBarCheckWithOutPOM {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/carrental");
		
		boolean isHomeLinkDisplayed = driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
		
		boolean isAboutUsLinkDisplayed = driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).isDisplayed();
		
		boolean isCarListingLinkDisplayed = driver.findElement(By.xpath("(//a[text()='Car Listing'])[1]")).isDisplayed();
		
		boolean isFaqsLinkDisplayed = driver.findElement(By.xpath("(//a[text()='FAQs'])[1]")).isDisplayed();
		
		boolean isContactUsLinkDisplayed = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).isDisplayed();
		
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
