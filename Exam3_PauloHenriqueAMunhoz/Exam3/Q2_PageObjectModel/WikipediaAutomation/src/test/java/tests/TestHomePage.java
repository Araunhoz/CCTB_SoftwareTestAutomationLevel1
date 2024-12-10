package test.java.tests;

import main.java.base.BaseClass;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import main.java.pages.HomePage;
import main.java.pages.SearchResultPage;

public class TestHomePage extends BaseClass {

    private static HomePage homePage;
    //Before of Run
    @BeforeClass
    public static void setUpBeforeClass() {

        setUp();
        homePage = new HomePage(driver);

    }
    //Before of Run
    @AfterClass
    public static void tearDownAfterClass() {

        tearDown();

    }
    // The tests
    @Test
    public void testNavigateToGermanVersion() {

        homePage.navigateToGermanVersion();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("de.wikipedia.org"));
        Assert.assertTrue(driver.getCurrentUrl().contains("de.wikipedia.org"));
   
    }

    @Test
    public void testNavigateToSpanishVersionAndSearch() {

        homePage.navigateToSpanishVersion();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("es.wikipedia.org"));
        Assert.assertTrue(driver.getCurrentUrl().contains("es.wikipedia.org"));

        homePage.performSearch("java");
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage.isSearchResultDisplayed());
        Assert.assertTrue(searchResultPage.getSearchResultText().contains("Java"));
    
    }
}
