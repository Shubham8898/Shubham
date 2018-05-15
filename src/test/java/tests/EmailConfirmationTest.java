package tests;


import org.testng.annotations.Test;

import base_class.EmailBaseClass;
import pages.EMailHomePage;
import pages.EMailLoginPage;

public class EmailConfirmationTest extends EmailBaseClass{

	@Test(priority=0)
	public void testEmail()
	{
		elp = new EMailLoginPage(driver);
		elp.clickOnLogin();
		elp.clickOnGo();
		
		ehp = new EMailHomePage(driver);
		ehp.clickOnMail();
		ehp.confirmTheMail();
		
	}
	
}
