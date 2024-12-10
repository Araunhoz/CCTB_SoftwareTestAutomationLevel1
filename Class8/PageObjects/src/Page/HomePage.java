package Page;

// Declares the package (project structure) for this class

import org.openqa.selenium.WebDriver;    // Import WebDriver interface for browser interaction
import org.openqa.selenium.WebElement;   // Import WebElement interface to represent HTML elements

public class HomePage {                // Defines a class named HomePage (interacts with Gmail's home page)

    private WebDriver driver;          // Private field to store the WebDriver instance for browser control

    private HomePage(WebDriver driver) {   // Private constructor to initialize HomePage (called internally)
        this.driver = driver;              // Assign the provided WebDriver to the driver field
    }

    public static HomePage getInstance(WebDriver driver) { // Static factory method to create HomePage instances
        return new HomePage(driver);                       // Creates and returns a new HomePage object
    }

    public void composeEmail() {                        // Public method to start composing a new email
        WebElement composeButton = driver.findElement(Locators.composeButtonLocator);  
        // Finds the "Compose" button using a locator defined in the Locators class
        composeButton.click();                           // Clicks the "Compose" button
    } 
} 