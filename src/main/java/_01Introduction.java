import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01Introduction {

    public static void main (String[] args) {

        //Set the path for browser driver (this step is optional from Selenium v4.6.0 -> Selenium Manager)
        System.setProperty("webdriver.chrome.driver","dependencies/chromedriver");

        // Invoke the browser
        //ChromeDriver driver = new ChromeDriver(); // Create object of ChromeDriver class to access its methods (like close(), get() etc)

        // Similar to above ChromeDriver class, we have classes for other browsers like FF,Edge etc, but all of these have the same set
        // of common methods
        // All these classes implement the WebDriver interface (Set of methods with empty bodies)
        // However, for eg, Chromedriver implements -> WebDriver methods + Own Methods (These own methods will be unique & unsupported
        // by other browsers)

        // Create object as below. This object has access to only those methods of ChromeDriver which are defined by WebDriver interface
        WebDriver driver = new ChromeDriver();

        // Now we can use the WebDriver methods using driver object
        driver.get("https://www.rahulshettyacademy.com");
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL:" + driver.getCurrentUrl());

        // Close browser
        driver.close(); // Quits only current window/tab
        //driver.quit() // Closes the driver & all open windows/tabs

    }

}
