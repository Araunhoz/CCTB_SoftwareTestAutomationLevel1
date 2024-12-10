package main.java.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    protected static WebDriver driver;
    
    // Method to Set Up
    public static void setUp() {

        driver = new ChromeDriver();
        //maximize the browser 
        driver.manage().window().maximize();
        //Go to the wikipedia site
        driver.get("https://www.wikipedia.org/");
    
    }
    
    //Method tearDown
    public static void tearDown() {

        if (driver != null) {
            //close the drive
            driver.quit();
        
        }
    }
}
