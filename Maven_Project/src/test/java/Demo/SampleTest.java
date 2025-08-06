package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void sampleTest() {
		
		WebDriver driver= new ChromeDriver();
		Reporter.log("Test is rinning", true);
	}
}
