package day4_xpath;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeFactory {

    public static void main(String[] args) {
        // go to google

        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://Google.com");
    }
}


