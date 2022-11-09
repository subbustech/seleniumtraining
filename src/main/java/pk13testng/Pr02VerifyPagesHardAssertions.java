package pk13testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pr02VerifyPagesHardAssertions {

	@Test(priority=1)
	public void verifyHomePage() {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		//boolean header1 = driver.findElement(By.xpath("//h2[contains(text(),'Find the Best') and span[contains(text(),'CarForYou')]]")).isDisplayed();
		String header1 = driver.findElement(By.xpath("//h2[contains(text(),'Find the Best') and span[contains(text(),'CarForYou')]]")).getText();
		
		System.out.println(header1);
		
		Assert.assertEquals(header1, "Find the Best CarForYou");
		
		System.out.println("Testing Assertions");
		
		System.out.println("Assertion Passed");
		
		driver.close();
	}	
	
}
