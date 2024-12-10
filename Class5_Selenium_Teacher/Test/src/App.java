import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Maluu Duduuu opened");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);   // 5 seconds looking to me :D 
        driver.quit();
        System.out.println("Maluu Duduuu closed");

    }
}
