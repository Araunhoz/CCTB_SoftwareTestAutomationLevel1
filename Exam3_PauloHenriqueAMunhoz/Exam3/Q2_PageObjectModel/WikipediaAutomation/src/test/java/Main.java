package test.java;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import test.java.tests.TestHomePage;
import test.java.tests.TestSearchResultPage;

public class Main {
    public static void main(String[] args) {

        System.out.println("Running tests...");

        // Run TestHomePage tests
        Result homePageResult = JUnitCore.runClasses(TestHomePage.class);
        printResult(homePageResult, "TestHomePage");

        // Run TestSearchResultPage tests
        Result searchResultPageResult = JUnitCore.runClasses(TestSearchResultPage.class);
        printResult(searchResultPageResult, "TestSearchResultPage");

        System.out.println("All tests completed.");
   
    }
    //Method to Display the Results
    private static void printResult(Result result, String testClassName) {

        if (result.wasSuccessful()) {

            System.out.println(testClassName + " passed.");
       
        } else {

            System.out.println(testClassName + " failed.");
            for (Failure failure : result.getFailures()) {

                System.out.println(failure.toString());
            
            }
        }
    }
}
