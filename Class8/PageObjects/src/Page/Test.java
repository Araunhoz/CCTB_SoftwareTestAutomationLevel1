package Page;

import org.openqa.selenium.chrome.ChromeDriver;   // Import ChromeDriver for Chrome browser automation

public class Test {
    public static void main(String[] args) {    // Main method (starting point of execution)

        ChromeDriver driver = new ChromeDriver();   // Create a new ChromeDriver instance
        driver.get(Locators.BASE_URL);                // Navigate to the base URL (Gmail)
        driver.close();                             // Close the browser window
        driver.quit();                              // Quit the WebDriver session (terminate all processes)

    }
}


