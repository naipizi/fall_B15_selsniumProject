package day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

    public static void main (String [] args ){
        /*
       1. go to cybertek practice web site
       2. verify Title Expected title practice

        Actual Title --> ?
        http:// practice.cybertekschool.com

         */

        // connect browser and driver
        //setup browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http: practice.cybertekschool.com/");
        driver.manage().window().maximize();

        String expectedTitle = "practice";

        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("I Expected " + expectedTitle);
            System.out.println("The Actual Title Is " + actualTitle);

        }
            driver.close();
        }
    }

