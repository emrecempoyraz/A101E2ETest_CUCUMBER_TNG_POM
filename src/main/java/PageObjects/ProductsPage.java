package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[@class='name-price'])[1]")
    private WebElement productLink ;

    public void selectProduct () {
        if (productLink.isDisplayed())
            helper.clickElement(productLink);
    }
}
