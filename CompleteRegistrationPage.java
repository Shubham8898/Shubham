package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;

public class CompleteRegistrationPage 
{

	WebDriver driver;
	
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
		WebElement alsell = driver.findElement(alreadySelling);
		Select sel1 = new Select(alsell);
		sel1.selectByIndex(2);
	}
	
	public void selectWhatSelling()
	{
		WebElement whsell = driver.findElement(whatSelling);
		Select sel2 = new Select(whsell);
		sel2.selectByValue("auto");
	}
	
	public void selectHaveWebsite()
	{
		WebElement website = driver.findElement(haveWebsite);
		Select sel3 = new Select(website);
		sel3.selectByVisibleText("Yes");
	}
	
	public void selectFacebook()
	{
		WebElement facebook = driver.findElement(addFacebook);
		Select sel3 = new Select(facebook);
		sel3.selectByVisibleText("No");
	}
	
	public void selectForSomeone()
	{
		WebElement someone = driver.findElement(forSomeone);
		Select sel3 = new Select(someone);
		sel3.selectByValue("yes");
	}
	
	public void clickCompleteRegi()
	{
		WebElement compreg = driver.findElement(completeReg);
		compreg.click();
	}
}
