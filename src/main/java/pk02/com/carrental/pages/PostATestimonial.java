package pk02.com.carrental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostATestimonial {
	WebDriver driver;
	public PostATestimonial(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement returnTextArea() {
		return driver.findElement(By.xpath("//textarea[@name='testimonial']"));
	}
	
	public WebElement returnSaveButton() {
		return driver.findElement(By.xpath("//button[@name='submit']"));
	}
	
	public WebElement returnSuccessDiv() {
		return driver.findElement(By.xpath("//div[@class='succWrap']"));
	}
}
