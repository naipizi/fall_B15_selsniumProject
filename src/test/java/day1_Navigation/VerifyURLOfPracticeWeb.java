package day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyURLOfPracticeWeb {

    public static void main(String[] args) throws InterruptedException{
        /*
        1.go to cybertek practice website
        http://practice.cybertekschool.com/
        2.veryfy the URL
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(" http://practice.cybertekschool.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        String expectedURL= "http://practice.cybertekschool.com/";
        String actualURL= driver.getCurrentUrl();
        Thread.sleep(4000);
        if (expectedURL.equals(actualURL)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected "+expectedURL);
            System.out.println("Actual URL is "+ actualURL);
        }
        driver.close();
    }
}





