package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseTest.BaseTest;

public class LoginPage extends BaseTest {
	//constructor (important to init)
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
//	
//	@FindBy(id = "user-name")
//	static WebElement element1;
//	
//	public static void main(String[] args) {
//		System.out.println(element1.getAttribute("class"));
//	}

	//write all the locators
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginbutton = By.id("login-button");
	
	
	//actions
	public void enterusername(String user) {
		driver.findElement(username).sendKeys(user);;
	}
	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);;
	}
	public void clicklogin() {
		driver.findElement(loginbutton).click();
	}
	 public void login(String user, String pass) {
	        enterusername(user);
	        enterpassword(pass);
	        clicklogin();
	    }
	 
}
