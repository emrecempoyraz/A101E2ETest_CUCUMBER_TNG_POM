package TestManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {

    private WebDriver driver ;


    public Helper (WebDriver driver) {
        this.driver = driver ;

    }

    public void clickElement (WebElement element) {
        if (element.isDisplayed())
            element.click();
    }

    public void sendKeys (WebElement element,String text) {
        if (element.isDisplayed())
            element.click() ;
        element.sendKeys(text);

    }



}
