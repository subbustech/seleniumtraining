package pk02.com.carrental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBarWithConstructor {
	
	WebDriver driver;
	public NavigationBarWithConstructor(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement returnHomeLink() {
		return driver.findElement(By.xpath("//a[text()='Home']"));
	}
	
	public WebElement returnAboutUsLink() {
		return driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
	}
	
	public WebElement returnCarListingLink() {
		return driver.findElement(By.xpath("(//a[text()='Car Listing'])[1]"));
	}
	
	public WebElement returnFaqsLink() {
		return driver.findElement(By.xpath("(//a[text()='FAQs'])[1]"));
	}
	
	public WebElement returnContactUsLink() {
		return driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
	}
	
	public WebElement returnSearchTextBox() {
		return driver.findElement(By.xpath("//input[@name='searchdata']"));
	}
	
	//User Dropdown
	public WebElement returnUserDropdown() {
		return driver.findElement(By.xpath("//li[@class='dropdown']/a"));
	}
	
	public WebElement returnPostATestimonialButton() {
		return driver.findElement(By.xpath("//a[text()='Post a Testimonial']"));
	}
	
	public WebElement returnMyTestimonialButton() {
		return driver.findElement(By.xpath("//a[text()='My Testimonial']"));
	}
	
	public WebElement returnSignOutButton() {
		return driver.findElement(By.xpath("//a[text()='Sign Out']"));
	}
}
