package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base_class.TestBase;

public class RegistrationPage extends TestBase
{	
	By fullName = By.name("name");
	By accemail = By.name("email");
	By accpassword = By.name("password");
	By register = By.cssSelector("form.create-form > div > button");
	

	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void enterfullName()
	{
		wb = driver.findElement(fullName);
		wb.sendKeys("Vijay Patil");
	}
	
	public void enterEmail()
	{	
		WebElement fieldset1 = driver.findElement(By.cssSelector("form.create-form > div > div:nth-child(4) > div:nth-child(2) > div.fieldset__field-wrapper > div.field.field--large"));
		fieldset1.click();
		
		wb = fieldset1.findElement(accemail);
		wb.click();
		wb.sendKeys("shubh7@mailinator.com");
	}
	
	public void enterPassword()
	{
		WebElement fieldset2 = driver.findElement(By.cssSelector("form.create-form > div > div:nth-child(5) > div:nth-child(2) > div.fieldset__field-wrapper > div.field.field--large"));
		fieldset2.click();
		
		wb = fieldset2.findElement(accpassword);
		wb.click();
		wb.sendKeys("123456");
	}
	
	public void clickRegister()
	{
		wb = driver.findElement(register);
		wb.click();
	}
}
