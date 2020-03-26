package day8_review2;

import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class GetAttributeExamples {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("");
    }
}
