package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CompleteRegistrationPage;
import pages.HomePage;
import pages.RegistrationPage;

public class Test_Registration {

	WebDriver driver;
	HomePage objHP;
	RegistrationPage objRP;
	CompleteRegistrationPage objCRP;
	
	public String driverPath = "C:\\Users\\Dell\\Desktop\\New folder\\";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ecwid.com/in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	public void testHomePage()
	{
		//Creating Home Page Object
		objHP = new HomePage(driver);
		//calling methods of HomePage class
		objHP.clickSignUp();
	
		
		//go to the next page
		//Creating Registration Page Object
		objRP = new RegistrationPage(driver);
		//calling methods of RegistrationPage class
		objRP.enterfullName();
		objRP.enterEmail();
		objRP.enterPassword();
		objRP.clickRegister();
				
		
		//go to the next page
		//Creating  CompleteRegistrationPage object
		objCRP = new CompleteRegistrationPage(driver);
		//calling methods of CompleteRegistrationPage
		objCRP.selectAlreadySelling();
		objCRP.selectWhatSelling();
		objCRP.selectHaveWebsite();
		objCRP.selectFacebook();
		objCRP.selectForSomeone();
		objCRP.clickCompleteRegi();
	}

	/*@AfterTest
	public void close()
	{
		driver.close();
	}*/
}