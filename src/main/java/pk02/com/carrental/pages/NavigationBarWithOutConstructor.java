package pk02.com.carrental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBarWithOutConstructor {
	
	public WebElement returnHomeLink(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Home']"));
	}
	
	public WebElement returnAboutUsLink(WebDriver driver) {
		return driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
	}
	
	public WebElement returnCarListingLink(WebDriver driver) {
		return driver.findElement(By.xpath("(//a[text()='Car Listing'])[1]"));
	}
	
	public WebElement returnFaqsLink(WebDriver driver) {
		return driver.findElement(By.xpath("(//a[text()='FAQs'])[1]"));
	}
	
	public WebElement returnContactUsLink(WebDriver driver) {
		return driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
	}
	
}
