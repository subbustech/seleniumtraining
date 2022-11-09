package pk02.com.carrental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTestimonialsPage {

	WebDriver driver;
	public MyTestimonialsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement returnLatestTestimonial(String testimonialMessage) {
		return driver.findElement(By.xpath("//ul[@class='vehicle_listing']/li/div/p[contains(text(),'"+testimonialMessage+"')]"));
	}
	
}
