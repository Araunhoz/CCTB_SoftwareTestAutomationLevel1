package test.java.tests;


import main.java.base.BaseClass;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import main.java.pages.HomePage;
import main.java.pages.SearchResultPage;

public class TestSearchResultPage extends BaseClass {

    private static HomePage homePage;
    //Before of Run
    @BeforeClass
    public static void setUpBeforeClass() {

        setUp();
        homePage = new HomePage(driver);
        homePage.navigateToSpanishVersion();
        homePage.performSearch("java");
        
    }
    //After of Run
    @AfterClass
    public static void tearDownAfterClass() {

        tearDown();

    }
    //The Tests
    @Test
    public void testSearchResultDisplayed() {

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage.isSearchResultDisplayed());
   
    }

    @Test
    public void testSearchResultText() {

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage.getSearchResultText().contains("Java"));
    
    }
}

