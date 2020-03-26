package day4_xpath;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {

        //go to practice login page
        // locate username box with absolute xpath
        // locate username box with relative xpath

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //absoloute
        WebElement userNameBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/input"));
        userNameBox.sendKeys("tom");

        //    //tagName[@attribute='value']

        //    <input type="text" name="username">

        //relative
        driver.findElement(By.xpath("//input[@type='text']"));



    }
}
