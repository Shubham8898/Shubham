package base_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CompleteRegistrationPage;
import pages.HomePage;
import pages.RegistrationPage;

public class TestBase {
	
	public HomePage objHP;
	public RegistrationPage objRP;
	public CompleteRegistrationPage objCRP;
	
	public WebElement wb;
	
	public Select sel;
	
	public WebDriver driver;
	
	public String driverPath = "/home/user/Downloads/Chrome Driver/";
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.ecwid.com/in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*
	@AfterClass
	public void close()
	{
		driver.close();
	}
	*/
}
