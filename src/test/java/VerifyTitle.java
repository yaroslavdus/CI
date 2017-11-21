import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			driver = new ChromeDriver();
		}
	}
	
	@Test
	public void test_01() {
		
		driver.get("http://learn-automation.com");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
