package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    private By addToCartBtn = By.xpath("//button[contains(text(),'Add to cart')]");
    private By removeBtn = By.xpath("//button[contains(text(),'Remove')]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Check if product is already added
    public boolean isProductAlreadyAdded() {
        return driver.findElements(removeBtn).size() > 0;
    }

    // Add to cart
    public void clickAddToCart() {
        driver.findElement(addToCartBtn).click();
    }
}
