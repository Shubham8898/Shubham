package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base_class.RegistrationBaseClass;

public class CompleteRegistrationPage extends RegistrationBaseClass
{
	
	By alreadySelling = By.id("gwt-uid-669");
	By whatSelling  = By.name("goods");
	By haveWebsite = By.name("website");
	By addFacebook = By.name("facebook");
	By forSomeone = By.id("gwt-uid-683");
	By completeReg = By.xpath("/html/body/div[8]/div/div[2]/div/div[1]/div/div/form/div[2]/div[2]/div/button");
	
	public CompleteRegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectAlreadySelling()
	{
		wb = driver.findElement(alreadySelling);
		sel = new Select(wb);
		sel.selectByIndex(2);
	}
	
	public void selectWhatSelling()
	{
		wb = driver.findElement(whatSelling);
		sel = new Select(wb);
		sel.selectByValue("auto");
	}
	
	public void selectHaveWebsite()
	{
		wb = driver.findElement(haveWebsite);
		sel = new Select(wb);
		sel.selectByVisibleText("Yes");
	}
	
	public void selectFacebook()
	{
		wb = driver.findElement(addFacebook);
		sel = new Select(wb);
		sel.selectByVisibleText("No");
	}
	
	public void selectForSomeone()
	{
		wb = driver.findElement(forSomeone);
		sel = new Select(wb);
		sel.selectByValue("yes");
	}
	
	public void clickCompleteRegi()
	{
		wb = driver.findElement(completeReg);
		wb.click();
	}
}
