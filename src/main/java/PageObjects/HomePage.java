package PageObjects;

import TestManager.IDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement acceptCookie;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement searchIcon ;

    public void acceptCookies () {
        if (acceptCookie.isDisplayed())
        helper.clickElement(acceptCookie);
    }

    @FindBy(xpath = "(//input[@name='search_text'])[1]")
    private WebElement searchBar ;

    public void searchProduct () {
        helper.clickElement(searchBar);
        helper.sendKeys(searchBar, IDriver.PRODUCT);
        helper.clickElement(searchIcon);
    }
}
