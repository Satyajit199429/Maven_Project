package ASSIGNMENT;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MAS2 {
	@Test
	public void login() {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("virat18rcbgamil.com");
		driver.findElement(By.id("Password")).sendKeys("virat@18");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/ScreenshotReports" + timestamp + ".htlm");
		
		ExtentReports ereport = new ExtentReports();
		ereport.attachReporter(spark);
		ExtentTest test = ereport.createTest("login");
		test.log(Status.PASS, "script is pass");
		test.addScreenCaptureFromBase64String(screenshot);
		ereport.flush();
	}

}
