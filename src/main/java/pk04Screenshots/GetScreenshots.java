package pk04Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenshots {

	public static String captureScreenshot(WebDriver driver) {
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		String base64code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		return base64code;
	}
	
	public static String captureScreenshot(WebDriver driver, String fileName) {
		
		long time = System.currentTimeMillis();
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("reports/screenshots/"+fileName+"_"+time+".png");
		try {
			FileUtils.copyFile(sourceFile, destFile);
		}
		catch(IOException e) {
			System.out.println("Screenshot can't be captured.");
		}
		return destFile.getAbsolutePath();
	}
}
