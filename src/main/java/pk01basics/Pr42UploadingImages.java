package pk01basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pr42UploadingImages {

	public static void main(String[] args) throws InterruptedException, IOException {

//		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "servers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

//		System.setProperty("webdriver.edge.driver", "servers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Css File Upload']")).click();
		Thread.sleep(2000);

		//AutoIt exe file
		if((driver instanceof ChromeDriver) || (driver instanceof EdgeDriver)) {
			Runtime.getRuntime().exec("windowsscripts\\upload.exe");
		}
		else if(driver instanceof FirefoxDriver) {
			Runtime.getRuntime().exec("windowsscripts\\firefoxupload.exe");
		}

		Thread.sleep(2000);

	}

}