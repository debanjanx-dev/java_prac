package com.ibm.automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class hydriddatatest {
	static WebDriver driver = new FirefoxDriver();

	static Actions acts;
	
	public static void geturl() {
		driver.get("file:///C:/Users/DebanjanMukherjee/eclipse-workspace/seleniumqautomation/mywebapp/index.html");
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
	}
	public static void windowchanging() {
		String parentWin = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Go to Google")).click();
		driver.findElement(By.partialLinkText("Go to Yahoo")).click();
		driver.findElement(By.partialLinkText("Go to Rediff")).click();
		Set<String> allWins = driver.getWindowHandles();
		for (String win : allWins) {
		    if (!win.equals(parentWin)) {
		        driver.switchTo().window(win);
		        break;
		    }
		}
		

	}
	public static void setup() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public static void main(String[] args) {
		setup();
	}
}
