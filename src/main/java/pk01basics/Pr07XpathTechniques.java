package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr07XpathTechniques {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);

		//find element by normal xpath (using id attribute)
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("By xpath and id attribute");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		Thread.sleep(2000);

		//find element by normal xpath (using name attribute)
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("By xpath and name attribute");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		Thread.sleep(2000);

		//find element by normal xpath (using class attribute)
		driver.findElement(By.xpath("//input[@class='beautifultextbox']")).sendKeys("By xpath and class attribute");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='beautifultextbox']")).clear();
		Thread.sleep(2000);

		//find element by xpath with and condition
		driver.findElement(By.xpath("//input[@id='firstname' and @class='beautifultextbox']")).sendKeys("By xpath with 'and'");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		Thread.sleep(2000);

		//find element by xpath with or condition
		driver.findElement(By.xpath("//input[@id='firstname' or @class='beautifultextbox']")).sendKeys("By xpath with 'or'");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		Thread.sleep(2000);

		//find element by xpath with regular expression
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("By xpath with regular expression");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='firstname']")).clear();
		Thread.sleep(2000);

		//find element by xpath with contains and attribute
		driver.findElement(By.xpath("//input[contains(@id,'first')]")).sendKeys("By xpath with contains and attribute");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'first')]")).clear();
		Thread.sleep(2000);

		//find element by xpath with contains and attribute
		driver.findElement(By.xpath("//input[contains(@id,'first')]")).sendKeys("By xpath with contains and attribute");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'first')]")).clear();
		Thread.sleep(2000);

		//find element by xpath with starts-with
		driver.findElement(By.xpath("//input[starts-with(@class,'more')]")).sendKeys("By xpath with starts-with");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@class,'more')]")).clear();
		Thread.sleep(2000);

		//		//find element by xpath with ends-with
		//		driver.findElement(By.xpath("//input[ends-with(@class,'xpaths')]")).sendKeys("By xpath with ends-with");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//input[ends-with(@class,'xpaths')]")).clear();
		//		Thread.sleep(2000);

		//Parent child relationship
		driver.findElement(By.xpath("//td[@id='monthlyamount']/input")).sendKeys("Parent Child relationship - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@id='monthlyamount']/input")).clear();
		Thread.sleep(2000);

		//following-sibling
		driver.findElement(By.xpath("(//tr[@id='sixthamount']/following-sibling::tr/td/input)[1]")).sendKeys("following-sibling - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//tr[@id='sixthamount']/following-sibling::tr/td/input)[1]")).clear();
		Thread.sleep(2000);

		//preceding-sibling
		driver.findElement(By.xpath("(//tr[@id='sixthamount']/preceding-sibling::tr/td/input)[1]")).sendKeys("preceding-sibling - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//tr[@id='sixthamount']/preceding-sibling::tr/td/input)[1]")).clear();
		Thread.sleep(2000);

		//Finding Parent Element
		driver.findElement(By.xpath("//tr[@id='secondamount']//parent::tbody/tr/td[2]/input")).sendKeys("Finding Parent - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[@id='secondamount']//parent::tbody/tr/td[2]/input")).clear();
		Thread.sleep(2000);

		//Finding Ancestor
		driver.findElement(By.xpath("(//tr[@id='secondamount'])[2]/ancestor::table[2]/tbody/tr/td[2]/input")).sendKeys("Finding Ancestor - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//tr[@id='secondamount'])[2]/ancestor::table[2]/tbody/tr/td[2]/input")).clear();
		Thread.sleep(2000);

		//Chained XPath
		driver.findElement(By.xpath("//table[@id='differentamounts']//input")).sendKeys("Using Chained XPath - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='differentamounts']//input")).clear();
		Thread.sleep(2000);

		//Indexing
		driver.findElement(By.xpath("(//table[@id='differentamounts']//input)[3]")).sendKeys("Indexing - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//table[@id='differentamounts']//input)[3]")).clear();
		Thread.sleep(2000);

		//Using Exact Text Match
		driver.findElement(By.xpath("//label[text()='Enter Payment Amount for Insurance:']/following-sibling::input")).sendKeys("Exact Text Match - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Enter Payment Amount for Insurance:']/following-sibling::input")).clear();
		Thread.sleep(2000);

		//Using Partial Text Match
		driver.findElement(By.xpath("//label[contains(text(),'Amount for Insurance:')]/following-sibling::input")).sendKeys("Partial Text Match - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Amount for Insurance:')]/following-sibling::input")).clear();
		Thread.sleep(2000);

		//Using normalize-space with Text Match
		driver.findElement(By.xpath("//label[normalize-space(text())='Payment Amount That Will Be Deducted:']/following-sibling::input")).sendKeys("normalize space - 1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space(text())='Payment Amount That Will Be Deducted:']/following-sibling::input")).clear();
		Thread.sleep(2000);

		//driver.close();
	}

}