package Extent_Reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {
	@Test
	public void CreateReport() {
		//STEP1- Create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Reports/ExtentReport.html");
		
		//STEP2- Create ExtentReports object
		ExtentReports eReport = new ExtentReports();
		
		//STEP3- Attach ExtentSparkReport to ExtentReports();
		eReport.attachReporter(spark);
		
		//STEP4- Create Extent Test object
		ExtentTest test = eReport.createTest("addingScreenshot");
		
		//STEP5- Call log(Status, message)
		test.log(Status.PASS, "Message");
		
		//STEP6- Call flush()
		eReport.flush();
	}
}
