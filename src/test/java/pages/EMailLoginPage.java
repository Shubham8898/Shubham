package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_class.BaseClass;


public class EMailLoginPage extends BaseClass {

	private By login = By.className("form-control");
	private By clickGO = By.cssSelector("div.input-group > span > button");
	
	public EMailLoginPage(WebDriver driver)
	{
		this.setDriver(driver);
	}
	
	public void clickOnLogin()
	{
		setWb(getDriver().findElement(login));
		getWb().sendKeys("abcd");
	}
	
	public void clickOnGo()
	{
		setWb(getDriver().findElement(clickGO));
		getWb().click();
	}
}
