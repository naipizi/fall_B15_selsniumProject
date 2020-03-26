package day4_xpath;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethodOfExpath {

    public static void main(String[] args) {
        /*
        go to http://practice.cybertekschool.com/context_menu
        verify is context menu is on the page
        tagName [text()= 'exact Text' ]
         */

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        // locate the element context menu

        WebElement text = driver.findElement(By.xpath("//h3[text()='Context Menu' "));

        //verify ----> expect vs actual
        String expectedText = "Context menu";

        String actualText = text.getText();

        if(expectedText.equals(actualText)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

    }
}
