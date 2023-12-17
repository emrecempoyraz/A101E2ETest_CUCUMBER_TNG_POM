package PageObjects;


import TestManager.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class BasePage {

    public WebDriver driver ;
    public Helper helper ;



    public BasePage (WebDriver driver) {
      this.driver = driver ;
      this.helper = new Helper(driver);
      PageFactory.initElements(driver,this);

    }
}
