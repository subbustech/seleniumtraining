package pk01basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Pr03BasicScriptOnEdge {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "servers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("http://www.google.com");

	}

}
