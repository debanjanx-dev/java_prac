package pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By productTitle = By.xpath("//span[text()='Products']");
    private By allProducts = By.xpath("//div[@class='inventory_item']");
    private By firstAddButton = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
    private By cartIcon = By.className("shopping_cart_link");


    public String getproducttitle() {
        return driver.findElement(productTitle).getText();
    }

    // Add first product
    public void addFirstProductToCart() {
        driver.findElement(firstAddButton).click();
    }

    public ProductPage openRandomProduct() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle));

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(allProducts));

        List<WebElement> products = driver.findElements(allProducts);

        if (products.isEmpty()) {
            throw new RuntimeException("No products found on Products page!");
        }

        // Pick random product index
        Random random = new Random();
        int index = random.nextInt(products.size());

        // Click on the random product
        products.get(index).click();

        return new ProductPage(driver);
    }

    // Go to cart
    public CartPage gotocart() {
        driver.findElement(cartIcon).click();
        return new CartPage(driver);
    }
}
