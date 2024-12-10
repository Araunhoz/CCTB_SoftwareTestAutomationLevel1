import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
			alertButton.click();
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String alertMessage = driver.switchTo().alert().getText();
			System.out.println("Alert Text is: "+alertMessage);
			alert.dismiss();
			
			WebElement alertButton5sec = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
			alertButton5sec.click();
			wait.until(ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert();
			alertMessage = driver.switchTo().alert().getText();
			System.out.println("Alert 5 seconds Text is: "+alertMessage);
			alert.dismiss();
			
			WebElement alertConfirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
			alertConfirmButton.click();
			wait.until(ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert();
			alertMessage = driver.switchTo().alert().getText();
			System.out.println("Alert Confirm Text is: "+alertMessage);
			alert.accept();
			
			
			WebElement alertPromptButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
			alertPromptButton.click();
			wait.until(ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert();
			alertMessage = driver.switchTo().alert().getText();
			System.out.println("Alert Prompt Text is: "+alertMessage);
		    alert.sendKeys("Team Members");
		    alert.accept();

			
		} catch (Exception e) {
            
			System.out.println("Error " + e.getMessage());
			
		}finally{

		driver.close();

        }
	}

}
