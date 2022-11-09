package pk01basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr44DeleteCookiesBasedOnDomainName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("https://www.trivago.in");
		Thread.sleep(2000);
		
		Set<Cookie> st =  driver.manage().getCookies();
		
		System.out.println("------Before Deleting--------");
		for(Cookie ck : st) {
			System.out.println(ck.getName()+" : "+ck.getDomain());
		}

		for(Cookie ck : st) {
			//if((ck.getDomain().equalsIgnoreCase("www.trivago.in")) || (ck.getDomain().equalsIgnoreCase("trivago.in"))) {
			if(ck.getDomain().contains("trivago")) {
				System.out.println("cookie matching");
				driver.manage().deleteCookie(ck);
			}
			
		}

		System.out.println("------After Deleting-------");
		Set<Cookie> st1 =  driver.manage().getCookies();
		for(Cookie ck : st1) {
			System.out.println(ck.getName()+" : "+ck.getDomain());
		}

	}

}
