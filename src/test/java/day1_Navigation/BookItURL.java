package day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BookItURL {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();
        String expected = "cybertek-reservation";
        String actual = driver.getCurrentUrl();
        if(actual.contains(expected))
        {System.out.println("Pass");}
        else
        {System.out.println("Failed");}
        driver.close();
    }
}



