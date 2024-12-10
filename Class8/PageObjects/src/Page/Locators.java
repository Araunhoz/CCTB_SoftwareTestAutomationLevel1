package Page;

import org.openqa.selenium.By;              // Import the By class for locating elements

public class Locators {                   // Defines a class named Locators (stores element locators)

    // Public static final fields to store locators for different elements:
    public static final By emailFieldLocator = By.id("identifierId");        // Locator for email input field
    public static final By passwordFieldLocator = By.name("password");       // Locator for password input field
    public static final By nextButtonLocator = By.xpath("//*[@id='identifierNext']");  
    // Locator for "Next" button (email) using XPath
    public static final By logInButtonLocator = By.xpath("//*[@id='passwordNext']");
    // Locator for "Sign In" button (password) using XPath
    public static final By composeButtonLocator = By.cssSelector("div.aic.z0"); 
    // Locator for "Compose" button using CSS Selector
    public static final String BASE_URL = "https://www.gmail.com/";
    
    private Locators() {              
        // Private constructor to prevent creating Locators objects
        // The Locators class is designed to be used statically 
    }
}