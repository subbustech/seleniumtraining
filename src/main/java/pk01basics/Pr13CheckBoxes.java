package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr13CheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='vehicle1']")).click();
		
		Thread.sleep(2000);
		
		boolean selected = driver.findElement(By.xpath("//input[@name='vehicle3']")).isSelected();

		if(selected) {
			System.out.println("Vehicle3 is already checked. Unchecking vehicle3");
			driver.findElement(By.xpath("//input[@name='vehicle3']")).click();
		}
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
