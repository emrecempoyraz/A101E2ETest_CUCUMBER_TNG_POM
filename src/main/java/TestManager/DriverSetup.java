package TestManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverSetup {

  public static WebDriver driver ;

  public static WebDriver initialize_Driver () {
      driver = new ChromeDriver(DriverOptions.getOptions());
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IDriver.IMP_WAIT));
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(IDriver.PAGE_WAIT));
      return getDriver() ;
  }

  public static WebDriver getDriver () {
      return driver ;
  }


}
