import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitGoogleSearch {

    public static void main(String[] args) {

        // Initialize a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Set an implicit wait of 25 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        // Navigate to Google's homepage
        driver.get("https://www.google.com");

        // Locate the search bar using its name attribute and send keys "selenium java" to it
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("selenium java");

        try {
            // Add a short sleep to simulate some processing
            Thread.sleep(200);  

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        // Close the browser and print "browser closed"
        driver.close();
        System.out.println("browser closed");

        // Quit the WebDriver and print "quit the browser and resources associated with it."
        driver.quit();
        System.out.println("quit the browser and resources associated with it.");
  
    }
}
