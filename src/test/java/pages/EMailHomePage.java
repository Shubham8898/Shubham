package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_class.EmailBaseClass;

public class EMailHomePage extends EmailBaseClass{

	By clickMail = By.className("all_message-min");
	By confirmMail = By.xpath("td[class='button']");
	
	public EMailHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnMail()
	{
		wb = driver.findElement(clickMail);
		wb.click();
	}
	
	public void confirmTheMail()
	{
		wb = driver.findElement(confirmMail);
		wb.click();
	}
}
