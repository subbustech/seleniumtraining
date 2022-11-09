package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr09cssSelectorTechniques {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);

//		//find element by normal cssSelector (using id attribute)
//		driver.findElement(By.cssSelector("input[id='firstname']")).sendKeys("By cssSelector and id attribute");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='firstname']")).clear();
//		Thread.sleep(2000);
//
//		//find element by normal cssSelector (using name attribute)
//		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("By cssSelector and name attribute");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[name='firstname']")).clear();
//		Thread.sleep(2000);
//
//		//find element by normal cssSelector (using class attribute)
//		driver.findElement(By.cssSelector("input[class='beautifultextbox']")).sendKeys("By cssSelector and class attribute");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[class='beautifultextbox']")).clear();
//		Thread.sleep(2000);
//
		//find element by cssSelector and multiple attributes
		driver.findElement(By.cssSelector("input[id='firstname'][class='beautifultextbox']")).sendKeys("By cssSelector and multiple attributes");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='firstname'][class='beautifultextbox']")).clear();
		Thread.sleep(2000);

		//find element by tagName#id
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("By tagName#id");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#firstname")).clear();
		Thread.sleep(2000);
		
		//find element by #id
		driver.findElement(By.cssSelector("#firstname")).sendKeys("By #id");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#firstname")).clear();
		Thread.sleep(2000);
		
		//find element by tagName.className
		driver.findElement(By.cssSelector("input.beautifultextbox")).sendKeys("By tagName.className");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.beautifultextbox")).clear();
		Thread.sleep(2000);
		
		//find element by tagName.className.className (Multiple Class Names)
		driver.findElement(By.cssSelector("input.tbborder.tbbackground")).sendKeys("By tagName.className.className");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.tbborder.tbbackground")).clear();
		Thread.sleep(2000);
		
		//find element by .className
		driver.findElement(By.cssSelector(".beautifultextbox")).sendKeys("By .className");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".beautifultextbox")).clear();
		Thread.sleep(2000);
		
		//find element by .className.className (Multiple Class Names)
		driver.findElement(By.cssSelector(".tbborder.tbbackground")).sendKeys("By .className.className");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".tbborder.tbbackground")).clear();
		Thread.sleep(2000);
		
		//CSS Locators for Sub String Matches – Starting text match with symbol ^ 
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("Css Selector with Starting Text Match");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='last']")).clear();
		Thread.sleep(2000);
		
		//CSS Locators for Sub String Matches – Ending text match with symbol $ 
		driver.findElement(By.cssSelector("input[name$=' name']")).sendKeys("Css Selector with Ending Text Match");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name$=' name']")).clear();
		Thread.sleep(2000);
		
		//CSS Locators for Sub String Matches – Anywhere text match with symbol *
		driver.findElement(By.cssSelector("input[class*='primary-text']")).sendKeys("Css Selector with Anywhere Text Match");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class*='primary-text']")).clear();
		Thread.sleep(2000);
		
		//Parent Child Relationship
		driver.findElement(By.cssSelector("td[id='monthlyamount']>input")).sendKeys("Parent Child Relationship");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("td[id='monthlyamount']>input")).clear();
		Thread.sleep(2000);

		//driver.close();
	}
}
