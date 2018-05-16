package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base_class.BaseClass;

public class DashboardPage extends BaseClass {

	private By clickProfile = By.linkText("My Profile");

	
	public DashboardPage(WebDriver driver) 
	{
		this.setDriver(driver);
	}
	
	public void clickOnProfile()
	{
		setWb(getDriver().findElement(clickProfile));
		Actions builder = new Actions(getDriver());
		builder.moveToElement(getWb()).build().perform();
		WebDriverWait wait = new WebDriverWait(getDriver(), 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Profile"))); 
		setWb(getDriver().findElement(By.linkText("Profile")));
		getWb().click();
	}
	}
