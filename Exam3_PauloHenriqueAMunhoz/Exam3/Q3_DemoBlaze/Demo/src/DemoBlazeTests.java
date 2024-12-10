import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoBlazeTests {

    private WebDriver driver;
    private String baseUrl = "https://www.demoblaze.com/";

    @Before
    public void setUp() {
        // Set up WebDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() {
        // Navigate to DemoBlaze website
        driver.get(baseUrl);

        // Click on Login link
        WebElement loginLink = driver.findElement(By.id("login2"));
        loginLink.click();

        // Enter valid credentials
        WebElement usernameInput = driver.findElement(By.id("loginusername"));
        usernameInput.sendKeys("TartarugaInabalavel");

        WebElement passwordInput = driver.findElement(By.id("loginpassword"));
        passwordInput.sendKeys("TartarugaInabalavel");

        // Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        // Verify successful login by checking for presence of user profile information
        WebElement userProfile = driver.findElement(By.id("nameofuser"));
        String loggedInUser = userProfile.getText();
        assert loggedInUser.equals("Welcome TartarugaInabalavel");
    }

    @Test
    public void testAddProductToCart() {
        // Navigate to DemoBlaze home page
        driver.get(baseUrl);

        // Click on a product category (e.g., Laptops)
        WebElement laptopsCategory = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
        laptopsCategory.click();

        // Click on a specific product (e.g., MacBook Pro)
        WebElement productLink = driver.findElement(By.linkText("MacBook Pro"));
        productLink.click();

        // Add the product to cart
        WebElement addToCartButton = driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
        addToCartButton.click();

        // Handle any confirmation or alert after adding to cart if needed
        // Example: Check for success message or alert and handle accordingly
    }

    @Test
    public void testContactCustomerSupport() {
        // Navigate to DemoBlaze home page
        driver.get(baseUrl);

        // Click on Contact link
        WebElement contactLink = driver.findElement(By.linkText("Contact"));
        contactLink.click();

        // Fill in the contact form
        WebElement nameInput = driver.findElement(By.id("recipient-email"));
        nameInput.sendKeys("Udyr");

        WebElement emailInput = driver.findElement(By.id("recipient-name"));
        emailInput.sendKeys("udyr@example.com");

        WebElement messageInput = driver.findElement(By.id("message-text"));
        messageInput.sendKeys("Foi de Vasco");

        // Submit the form
        WebElement sendButton = driver.findElement(By.xpath("//button[contains(text(),'Send message')]"));
        sendButton.click();

        // Handle alert popup if present
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept(); // Dismiss or accept alert based on requirement
        } catch (NoAlertPresentException e) {
            // No alert found, continue with test
        }
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
