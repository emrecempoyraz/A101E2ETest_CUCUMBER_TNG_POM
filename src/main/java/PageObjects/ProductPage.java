package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".add-to-basket.button.green.block.with-icon.js-add-basket")
    private WebElement addToBasketButton;

    @FindBy(xpath = "//a[@class='go-to-shop']")
    private WebElement viewBasket ;

    @FindBy(xpath = "(//span[@class='count js-basket-quantity'])[1]")
    private WebElement cartCount ;

    public void addProductToCart () {
        if (addToBasketButton.isDisplayed())
            helper.clickElement(addToBasketButton);
    }

    public void goToBasket () throws InterruptedException {
        Thread.sleep(5000);
        if (viewBasket.isDisplayed())
        helper.clickElement(viewBasket);
    }

    public boolean isProductCountUp () {
        return getCartCount (cartCount) > 0 ;
    }

    private int getCartCount (WebElement element) {
        String count = element.getText();
        return Integer.parseInt(count);
    }
}
