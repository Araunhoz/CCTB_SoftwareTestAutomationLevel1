package Page;


import org.openqa.selenium.WebDriver;   // Import WebDriver
import org.openqa.selenium.WebElement;  // Import WebElement

public class SignInPage {              // Class to handle the Gmail sign-in page

    private WebDriver driver;         // Stores the WebDriver instance

    public SignInPage(WebDriver driver) {   // Constructor to initialize SignInPage with a WebDriver
        this.driver = driver;
    }

    public void enterEmail(String email) {
        // Enters email in the email field
        WebElement emailField = driver.findElement(Locators.emailFieldLocator); // Find the email field
        // If the email field is visible, enter the provided email. Otherwise, print an error message.
        if (emailField.isDisplayed()) {
            emailField.sendKeys(email);
        } else {
            System.out.println("Email field is not visible"); 
        }
        driver.findElement(Locators.nextButtonLocator).click(); // Click the "Next" button
    }


public void enterPassword(String password) {
// Verify if the password field is visible and enter the password
 WebElement passwordField = driver.findElement(Locators.passwordFieldLocator);
 if (passwordField.isDisplayed()) {
 passwordField.sendKeys(password);
} else {
 System.out.println("Password field is not visible");
}

 // Click on the Sign In button
 driver.findElement(Locators.logInButtonLocator).click();
}

}
