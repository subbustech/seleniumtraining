package pk12testnglistenerstakescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Successful");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(StoreDrivers.map1);
		String clname = result.getInstanceName();
		System.out.println("Class Name is "+clname);
		WebDriver driver = StoreDrivers.map1.get(clname);
		String mthname = result.getName();
		System.out.println("Method Name is "+mthname);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("screenshots/"+clname+"."+mthname+".png"));
			System.out.println("screenshot captured successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StoreDrivers.map1.remove(clname);
		driver.quit();
		System.out.println("Test Failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed but within Success percentage");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Suite Started");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Suite Finished");
	}

}