package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) {

        /*
        User story : As a user , I should be able to login VyTrack app .
        test case1: login successfully
        1. go to VyTrack login page
        2. write username data: storeManager52
        3.write password UserUser123
        4. click login button
        5. Verify that the user is on the homepage

        test cases2 : login invalid cridentail
        1. go to login page
        2. write invalid user name
        3.


         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("prependedInput")).sendKeys("storeManager");
        driver.findElement(By.id("prependedInput")).sendKeys("user123");

        WebElement loginBttn = driver.findElement(By.id("_submit"));
        loginBttn.click();

        // login button can be found and clicked diractly.
        //driver.findELMENT(BY.Id("_Submit")).clicked

        /*
        Verify that you are in the home page

         */


        String expectedTitle = "Dashboard";
        String actualTitle = driver.getCurrentUrl();

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
        System.out.println("pass");

    }else{
        System.out.println("Fail");
        System.out.println("Expected " +expectedTitle);
        System.out.println("Actual " + actualTitle);
    }
}
}





