package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    // write a return method which returns webDriver
    //name: getDriver
    //it takes a String as a parameter ---> browser type
    //returns ChromeDriver snf FireFoxDriver

    public static WebDriver getDriver (String browserType) {
        // local variables
        WebDriver driver = null;
        switch (browserType){
            case "Chrome" :
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "FireFox" :
                WebDriverManager.firefoxdriver();
                driver = new FirefoxDriver();
                break;

        }

        return driver;







    }
}
