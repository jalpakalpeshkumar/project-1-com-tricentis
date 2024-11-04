package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * import java.awt.*;1. Set upMulti browser test.
 *  Open URL.
 *  Print the title of the page.
 *  Print the current URL.
 *  Print the page source.
 *  Navigate to Url .
 * “https://demowebshop.tricentis.com/login ”
 *  Print the current URL.
 *  Navigate back to the home page.
 *  Navigate to the login page.
 *  Print the current URL.
 *  Refresh the page.
 * Enter the email in the email field.
 * Enter the password in the password field.
 * Click on the Login Button .
 */


public class MultiBrowserTest {

    static String browser = "Chrome";
    static String baseUrl = " https://demowebshop.tricentis.com/";
    static WebDriver driver;


    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
        } else {
            System.out.println("Wrong Browser name");
        }

        //open URL
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current Url" + currentUrl);

        //Print the page source
        System.out.println("The page source :"  + driver.getPageSource());

        //Navigate to Url.
        String loginUrl = "https://demowebshop.tricentis.com/";
        driver.navigate().to(loginUrl);

        //Print the current URL.
        System.out.println("Get current URL :" + driver.getCurrentUrl());

        //Navigate back to the home page
        driver.navigate().back();

        //Navigate to the login page
        driver.get("https://demowebshop.tricentis.com/login");

        //print the current URL
        System.out.println("Current URL after navigating back to login: " + driver.getCurrentUrl());

        //refresh the page
        driver.navigate().refresh();

        //Enter the email in the email field.
        driver.findElement(By.id("Email")).sendKeys("jalpa.kanada40@gmail.com");

        //Enter the password in the password field.
        driver.findElement(By.id("Password")).sendKeys("Jalpa1234");

        //Click on the Login Button.
        driver.findElement(By.xpath("//input[@value='Log in']")).click();


         driver.close();

    }
}
