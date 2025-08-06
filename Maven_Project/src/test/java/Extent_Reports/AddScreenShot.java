package Extent_Reports;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddScreenShot {
	
	@Test
	public void addScreenshot() {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		String screenShot = ts.getScreenshotAs(OutputType.BASE64);
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/ScreenshotReports" + timestamp + ".htlm");
		ExtentReports eReport = new ExtentReports();
		eReport.attachReporter(spark);
		ExtentTest test = eReport.createTest("addscreenShot");
		test.log(Status.INFO, "Adding Screenshot");
		test.addScreenCaptureFromBase64String(screenShot);
		eReport.flush();
		
	}
}
