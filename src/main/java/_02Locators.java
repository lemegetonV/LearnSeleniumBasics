import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02Locators {

    public static void main (String[] args) {

        //System.setProperty("webdriver.chrome.driver","dependencies/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com"); // Page URL
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL:" + driver.getCurrentUrl());

        // Write Code Here


        driver.close();

    }

}
