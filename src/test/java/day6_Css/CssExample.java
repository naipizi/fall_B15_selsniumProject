package day6_Css;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssExample {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button = driver.findElement(
                                    By.cssSelector("h4"));
        System.out.println(button.getText());

        driver.quit();

    }


}
