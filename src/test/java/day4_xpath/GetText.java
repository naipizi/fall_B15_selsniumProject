package day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

     // go to forgot password web page
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        // enter any email
        // locate the email box first
        WebElement emailbox = driver.findElement(By.name("email"));
        // enter email ---< sendKeys()
        emailbox.sendKeys("abc@gmail.com");

        //click "retrieve password" bttb
        // locate the bottom first
        WebElement submitBottom = driver.findElement(By.id("form_submit"));
        //submit email by clicking the "retrive password "
        submitBottom.submit();

        // verify that the confirmation text " Your e-mail's been sent ";

        String expectedText = " Your e-mail's been sent";

        WebElement message = driver.findElement(By.name("confirmation_message"));

        //getText()--->
        String ActualText = message.getText();

        if(expectedText.equals(ActualText)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }





    }
}
