package main.java.pages;

import main.java.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    WebDriver driver;
    //Find the Locator search Input
    @FindBy(id = "searchInput")
    WebElement searchInput;
    //Find the Locator submit
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;
    //Find the Locator Language Link DE
    @FindBy(id = "js-link-box-de")
    WebElement languageLinkDE;
    //Find the Locator search language Link ES
    @FindBy(id = "js-link-box-es")
    WebElement languageLinkES;
    
    //Constructor
    public HomePage(WebDriver driver) {
  
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    
    //Methods
    public void navigateToGermanVersion() {

        languageLinkDE.click();

    }

    public void navigateToSpanishVersion() {

        languageLinkES.click();

    }

    public void performSearch(String query) {

        searchInput.sendKeys(query);
        searchButton.click();
        
    }
}
