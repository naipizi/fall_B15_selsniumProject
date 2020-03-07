package day3_Locators2;


import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
    public static void main(String[] args) throws InterruptedException{

         /*
    1. go to login page http://practice.cybertekschool.com/login
    2. enter invalid username
    3. enter invalid password
    4. Verify the error massage "Your username is invalid!"
     */



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Faker fake = new Faker();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(new Faker().name().username());
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(new Faker().gameOfThrones().character(), Keys.ENTER);
        Thread.sleep(2000);
        if(driver.findElement(By.id("flash")).getText().contains("Your username is invalid!")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        Thread.sleep(2000);
        driver.close();



    }
}
