import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	static WebDriver driver;
	
	@Test
	public void test_01() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://learn-automation.com");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
