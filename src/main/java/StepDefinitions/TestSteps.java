package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.ProductPage;
import PageObjects.ProductsPage;
import TestManager.BaseTest;
import TestManager.IDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static TestManager.BaseTest.driver;

public class TestSteps {


    private final HomePage homePage = new HomePage(driver);
    private final ProductsPage productsPage = new ProductsPage(driver);
    private final ProductPage productPage = new ProductPage(driver);

    @Given("Navigate to Website")
    public void navigate_to_website() {
        BaseTest.navigateToUrl(IDriver.URL);
        homePage.acceptCookies();
    }

    @Given("Search product on searchbar")
    public void search_product_on_searchbar() {
        homePage.searchProduct();
    }

    @Given("Pick from products list")
    public void pick_from_products_list() {
        productsPage.selectProduct();
    }

    @Given("Go to product page")
    public void go_to_product_page() {
       productPage.addProductToCart();
    }

    @When("Add product to cart")
    public void add_product_to_cart() throws InterruptedException {
        productPage.goToBasket();
    }

    @Then("Verify product added to cart")
    public void verify_product_added_to_cart() {
        Assert.assertTrue(productPage.isProductCountUp());
    }
}
