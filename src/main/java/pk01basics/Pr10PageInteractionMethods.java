package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr10PageInteractionMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);

//		//Sending information to Text Box
//		driver.findElement(By.id("firstname")).sendKeys("Venkat");
//		Thread.sleep(2000);
//		
//		
//		//Sending information to Textarea
//		driver.findElement(By.id("description")).sendKeys("Enter information into text area");
//		Thread.sleep(2000);
//		
//		//Clearing a value in Text Box or Textarea
//		driver.findElement(By.id("firstname")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("description")).clear();
//		Thread.sleep(2000);
//		
//		//Clicking a button
//		driver.findElement(By.xpath("//button[@id='check']")).click();
//		
//		//Clicking a checkbox
//		driver.findElement(By.xpath("//input[@name='vehicle1']")).click();
//		Thread.sleep(2000);
//		
//		//Clicking a radio button
//		driver.findElement(By.xpath("//input[@value='female']")).click();
//		Thread.sleep(2000);
//		
//		//Clicking a hyperlink
//		driver.findElement(By.linkText("google the top search engine")).click();
//		Thread.sleep(2000);

		//Getting attribute - value
		String withdrawalAmount1 = driver.findElement(By.xpath("//table[@id='withdrawalamounts']//input")).getAttribute("value");
		System.out.println("Withdrawal Amount 1: "+withdrawalAmount1);
		String withdrawalAmount2 = driver.findElement(By.xpath("(//table[@id='withdrawalamounts']//input)[2]")).getAttribute("value");
		System.out.println("Withdrawal Amount 2: "+withdrawalAmount2);
		String withdrawalAmount3 = driver.findElement(By.xpath("(//table[@id='withdrawalamounts']//input)[3]")).getAttribute("value");
		System.out.println("Withdrawal Amount 3: "+withdrawalAmount3);
		
		//Getting attribute - class
		String className = driver.findElement(By.xpath("//input[@id='firstname']")).getAttribute("class");
		System.out.println("Class Name: "+className);
		
		//Get Tag Name
		String tagName = driver.findElement(By.xpath("//input[@id='firstname']")).getTagName();
		System.out.println("Tag Name: "+tagName);
		
		//Get Css Attribute
		String fontFamily = driver.findElement(By.xpath("//label[text()='Css File Upload']")).getCssValue("font-family");
		System.out.println("Font Family: "+fontFamily);
		
		//Get Text
		String widthdrawalAmount = driver.findElement(By.xpath("//span[@id='withdrawalamount']")).getText();
		System.out.println("Withdrawal Amount: "+widthdrawalAmount);
		
		//Check if an element is displayed or hidden
		boolean isDisplaed = driver.findElement(By.xpath("//div[@id='hiddentext']")).isDisplayed();
		if(isDisplaed) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is hidden");
		}
		
		driver.findElement(By.xpath("//button[@id='makevisible']")).click();
		
		System.out.println("Clicked button to display the element");
		
		isDisplaed = driver.findElement(By.xpath("//div[@id='hiddentext']")).isDisplayed();
		if(isDisplaed) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is hidden");
		}
		
		//Check if an element is enabled or disabled
		boolean isEnabled = driver.findElement(By.xpath("//input[@id='disabled']")).isEnabled();
		if(isEnabled) {
			System.out.println("Element is Enabled");
		}
		else {
			System.out.println("Element is Disabled");
		}
		
		isEnabled = driver.findElement(By.xpath("//input[@id='firstname']")).isEnabled();
		if(isEnabled) {
			System.out.println("Element is Enabled");
		}
		else {
			System.out.println("Element is Disabled");
		}
		
		//Check if a radio button or checkbox is selected
		boolean isSelected = driver.findElement(By.xpath("//input[@value='male']")).isSelected();
		if(isSelected) {
			System.out.println("Element is Selected");
		}
		else {
			System.out.println("Element is not Selected");
		}
		
		isSelected = driver.findElement(By.xpath("//input[@value='female']")).isSelected();
		if(isSelected) {
			System.out.println("Element is Selected");
		}
		else {
			System.out.println("Element is not Selected");
		}
	}
}
