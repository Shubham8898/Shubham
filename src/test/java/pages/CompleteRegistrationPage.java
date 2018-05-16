package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base_class.BaseClass;

public class CompleteRegistrationPage extends BaseClass
{
	
	By alreadySelling = By.name("already_selling");
	By whatSelling  = By.name("goods");
	By haveWebsite = By.name("website");
	By addFacebook = By.name("facebook");
	By forSomeone = By.name("for_someone");
  //By completeReg = By.xpath("/html/body/div[8]/div/div[2]/div/div[1]/div/div/form/div[2]/div[2]/div/button");
	By completeReg = By.cssSelector("div.billing-upgrade > div > button");
	
	public CompleteRegistrationPage(WebDriver driver)
	{
		this.setDriver(driver);
	}
	
	public void selectAlreadySelling()
	{
		setWb(getDriver().findElement(alreadySelling));
		setSel(new Select(getWb()));
		getSel().selectByIndex(2);
	}
	
	public void selectWhatSelling()
	{
		setWb(getDriver().findElement(whatSelling));
		setSel(new Select(getWb()));
		getSel().selectByValue("auto");
	}
	
	public void selectHaveWebsite()
	{
		setWb(getDriver().findElement(haveWebsite));
		setSel(new Select(getWb()));
		getSel().selectByVisibleText("Yes");
	}
	
	public void selectFacebook()
	{
		setWb(getDriver().findElement(addFacebook));
		setSel(new Select(getWb()));
		getSel().selectByVisibleText("No");
	}
	
	public void selectForSomeone()
	{
		setWb(getDriver().findElement(forSomeone));
		setSel(new Select(getWb()));
		getSel().selectByValue("yes");
	}
	
	public void clickCompleteRegi()
	{
		setWb(getDriver().findElement(completeReg));
		getWb().click();
	}
}
