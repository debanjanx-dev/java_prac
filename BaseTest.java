package baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;
	
//	public BaseTest(WebDriver driver) {
//		this.driver = driver;
//	}
//	public BaseTest() {
//		//super();
//	}
//	
//	public void getTitle() {
//		System.out.println("this is get titlev");
//	}
	
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		System.out.println("driver initialized");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
//		PageFactory.initElements(driver, this);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
