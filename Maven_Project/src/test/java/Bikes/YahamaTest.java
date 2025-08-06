package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class YahamaTest {
	@Test
	public void launch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://apriliaindia.com/");
		Reporter.log("Yamaha Launched", true);
	}
}
