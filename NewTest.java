package pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import baseTest.BaseTest;

public class NewTest extends BaseTest {

    @Test(priority = 1)
    public void LoginTest() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.login("standard_user", "secret_sauce");

        HomePage homepage = new HomePage(driver);
        Assert.assertEquals(homepage.getproducttitle(), "Products");

        System.out.println("Login Test Passed");
    }

    @Test(priority = 2)
    public void CheckoutTest() {

        LoginPage loginpage = new LoginPage(driver);
        loginpage.login("standard_user", "secret_sauce");

        HomePage homepage = new HomePage(driver);

 
        homepage.addFirstProductToCart();

        CartPage cartPage = homepage.gotocart();
        CheckoutPage checkout = cartPage.clickcheckout();

        checkout.fillCheckoutDetails("Debanjan", "Mukherjee", "713023");

        checkout.clickFinish();

        Assert.assertEquals(
                checkout.getOrderConfirmationMsg(),
                "Thank you for your order!"
        );

        System.out.println("Checkout Test Completed - Transaction Successful");
    }
    @Test(priority = 3)
    public void RandomProductAddTest() {

        // Login
        LoginPage loginpage = new LoginPage(driver);
        loginpage.login("standard_user", "secret_sauce");

        HomePage home = new HomePage(driver);

        ProductPage productPage = home.openRandomProduct();

        if (productPage.isProductAlreadyAdded()) {
            System.out.println("Product is already added to cart.");
        } else {
            productPage.clickAddToCart();
            System.out.println("Product added to cart successfully.");
        }
    }



}
