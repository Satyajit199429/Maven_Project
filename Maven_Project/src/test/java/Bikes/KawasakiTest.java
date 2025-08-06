package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KawasakiTest {
	@Test
	public void launch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kawasaki.com/en-us/motorcycle/ninja/hypersport/ninja-h2r");
		Reporter.log("Kawasaki Launched", true);
	}
}