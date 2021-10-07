package frontendCreation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.spotsearch.generics.BaseClass;
public class CreateFrontend extends BaseClass {

	@Test
	public void test()
	{
		openWebsite("https://qa-dashboard.oneorigin.us/");
		login("Vishwanath@oneorigin.us","Tester@1");
		logout();
		
	}		
}
