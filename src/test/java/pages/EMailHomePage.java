package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_class.BaseClass;

public class EMailHomePage extends BaseClass{

	private By clickMail = By.className("all_message-min");
	//By confirmMail = By.
			
	
	public EMailHomePage(WebDriver driver)
	{
		this.setDriver(driver);
	}
	
	public void clickOnMail()
	{
		setWb(getDriver().findElement(clickMail));
		getWb().click();
	}
	
	public void confirmTheMail()
	{
		
        //Now click on Confirm Mail button; it will open in new window
	    //wb = driver.findElement(confirmMail);
	    //wb.click();
		
	    
        //Switch to newly opened window -RSS and get the page title
     	for(String winHandle : getDriver().getWindowHandles())
     	{
			getDriver().switchTo().window(winHandle);
		}
			
     	System.out.println("Title of the page after - switchingTo: " + getDriver().getTitle());
     	
	}
}
