import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlert {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(20000);
        driver.close();
        driver.findElement(By.name("proceed")).click();

        Alert alert = driver.switchTo().alert();
        String ExpectedAlertMessage = alert.getText();
        String actualAlertMessage = alert.getText();

        if(ExpectedAlertMessage.equals(actualAlertMessage)){

            alert.accept();
            
        }

        driver.close();
  
    }

}
