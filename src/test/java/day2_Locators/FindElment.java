package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElment {
    public static void main (String [] args ) throws InterruptedException {

        // Locator ID
        // go to ceybertek okta login page
        // write email to the text box

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.okta.com");

        // write email to the text box
        /*
        1. find the text box first ---> findElment() frome Webdriver

         */

        Thread.sleep(3000);

       WebElement emailBox =  driver.findElement(By.id("okta-signin-username"));

       emailBox.sendKeys("nafisaamet@gamail.com");

       // write your password to the password text box
        driver.findElement(By.id("okta-signin-password")).sendKeys("helloWorld123");

    }
}
