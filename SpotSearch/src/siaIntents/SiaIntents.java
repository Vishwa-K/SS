package siaIntents;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SiaIntents {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://siabot-test-bucket-new.s3.amazonaws.com/wsu-registrar-prod.html");
	driver.findElement(By.id("chat-button")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@class='action-buttons']/span[2]")).click();
	driver.findElement(By.xpath("//input[@class='chat-input']")).sendKeys("Hi Sia"+Keys.ENTER);
	
	
	
	
}
	
	
	
	
	
}
