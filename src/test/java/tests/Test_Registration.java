package tests;

import org.testng.annotations.Test;
import base_class.TestBase;
import pages.CompleteRegistrationPage;
import pages.HomePage;
import pages.RegistrationPage;

public class Test_Registration extends TestBase {

	
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

}