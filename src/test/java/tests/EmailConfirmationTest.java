package tests;


import org.testng.annotations.Test;

import base_class.BaseClass;
import pages.EMailHomePage;
import pages.EMailLoginPage;

public class EmailConfirmationTest extends BaseClass{

	@Test(priority=0)
	public void testEmail()
	{
		setObjELP(new EMailLoginPage(getDriver()));
		getObjELP().clickOnLogin();
		getObjELP().clickOnGo();
		
		setObjEHP(new EMailHomePage(getDriver()));
		getObjEHP().clickOnMail();
		//getEhp().confirmTheMail();
		
	}
	
}
