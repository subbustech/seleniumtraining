package pk01basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr01BasicScriptOnChrome {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");

	}

}
