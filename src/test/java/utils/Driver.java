package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;

public class Driver {
   // public WebDriver driver;
    public static WebDriver driver;

    public static WebDriver getDriver(){
       if (driver==null) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       }
        return driver;

    }
    public static void quitDriver(){
        if (driver!=null){
            driver.close();
            driver=null;
        }

    }


}
