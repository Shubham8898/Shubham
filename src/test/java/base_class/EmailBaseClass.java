package base_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.EMailHomePage;
import pages.EMailLoginPage;

public class EmailBaseClass {

	public EMailHomePage ehp;
	public EMailLoginPage elp;
	
	public WebElement wb;
	public WebDriver driver;
	
public String driverPath = "/home/user/Downloads/Chrome Driver/";
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.mailinator.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
