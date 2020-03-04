package day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBookItURL {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        String words = "cybertek-reservation";
        if (driver.getCurrentUrl().contains(words)) {
            System.out.println("Pass, it contains");
        } else {
            System.out.println("Fail, it doesn't contain");
        }
        driver.close();


    }
}