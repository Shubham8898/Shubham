package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import base_class.BaseClass;
import pages.CompleteRegistrationPage;
import pages.DashboardPage;
import pages.HomePage;
import pages.RegistrationPage;

public class UserRegistrationTest extends BaseClass {

	
	@Test(priority=0)
	public void testHomePage()
	{
		//Creating Home Page Object
		setObjHP(new HomePage(getDriver()));
		//calling methods of HomePage class
		getObjHP().clickSignUp();
	
		//go to the next page
		//Creating Registration Page Object
		setObjRP(new RegistrationPage(getDriver()));
		
		//calling methods of RegistrationPage class
		getObjRP().enterfullName();
		getObjRP().enterEmail();
		getObjRP().enterPassword();
		getObjRP().clickRegister();
		
		
				
		
		//go to the next page
		//Creating  CompleteRegistrationPage object
		setObjCRP(new CompleteRegistrationPage(getDriver()));
		//calling methods of CompleteRegistrationPage
		getObjCRP().selectAlreadySelling();
		getObjCRP().selectWhatSelling();
		getObjCRP().selectHaveWebsite();
		getObjCRP().selectFacebook();
		getObjCRP().selectForSomeone();
		getObjCRP().clickCompleteRegi();
		
		
		//go to the next page
		//Creating DashboardPage Object
		setObjDP(new DashboardPage(getDriver()));
		//calling methods of DashboardPage
		getObjDP().clickOnProfile();		
	}

}