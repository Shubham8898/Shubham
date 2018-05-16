package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base_class.BaseClass;

public class RegistrationPage extends BaseClass
{	
	By fullName = By.name("name");
	By accemail = By.name("email");
	By accpassword = By.name("password");
	By register = By.cssSelector("form.create-form > div > button");
	

	public RegistrationPage(WebDriver driver)
	{
		this.setDriver(driver);
	}
	
	
	public void enterfullName()
	{
		setWb(getDriver().findElement(fullName));
		getWb().sendKeys("ABCD");
	}
	
	public void enterEmail()
	{	
		WebElement fieldset1 = getDriver().findElement(By.cssSelector("form.create-form > div > div:nth-child(4) > div:nth-child(2) > div.fieldset__field-wrapper > div.field.field--large"));
		fieldset1.click();
		
		setWb(fieldset1.findElement(accemail));
		getWb().click();
		getWb().sendKeys("abcd@mailinator.com");
	}
	
	public void enterPassword()
	{
		WebElement fieldset2 = getDriver().findElement(By.cssSelector("form.create-form > div > div:nth-child(5) > div:nth-child(2) > div.fieldset__field-wrapper > div.field.field--large"));
		fieldset2.click();
		
		setWb(fieldset2.findElement(accpassword));
		getWb().click();
		getWb().sendKeys("123456");
	}
	
	public void clickRegister()
	{
		setWb(getDriver().findElement(register));
		getWb().click();
	}
}
