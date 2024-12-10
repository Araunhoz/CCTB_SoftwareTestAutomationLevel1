package main.java.pages;

import main.java.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseClass {

    WebDriver driver;
    //Find the Locator search Result Header
    @FindBy(id = "firstHeading")
    WebElement searchResultHeader;
    
    //Constructor
    public SearchResultPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    //Methods
    public boolean isSearchResultDisplayed() {

        return searchResultHeader.isDisplayed();

    }

    public String getSearchResultText() {

        return searchResultHeader.getText();
        
    }
}
