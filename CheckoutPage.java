package pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstname = By.id("first-name");
    private By lastname = By.id("last-name");
    private By postalcode = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");

    public void enterFirstName(String fname) {
        driver.findElement(firstname).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        driver.findElement(lastname).sendKeys(lname);
    }

    public void enterPostalCode(String code) {
        driver.findElement(postalcode).sendKeys(code);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void clickFinish() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement finish = wait.until(ExpectedConditions.visibilityOfElementLocated(finishButton));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", finish);

        wait.until(ExpectedConditions.elementToBeClickable(finish)).click();
    }

    public String getOrderConfirmationMsg() {
        return driver.findElement(By.className("complete-header")).getText();
    }

    public void fillCheckoutDetails(String fname, String lname, String code) {
        enterFirstName(fname);
        enterLastName(lname);
        enterPostalCode(code);
        clickContinue();
    }
}
