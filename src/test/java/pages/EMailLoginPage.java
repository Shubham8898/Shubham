package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_class.EmailBase;

public class EMailLoginPage extends EmailBase {

	By login = By.className("form-control");
	By clickGO = By.cssSelector("div.input-group > span > button");
	
	public EMailLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnLogin()
	{
		wb = driver.findElement(login);
		wb.sendKeys("shubh9");
	}
	
	public void clickOnGo()
	{
		wb = driver.findElement(clickGO);
		wb.click();
	}
}
