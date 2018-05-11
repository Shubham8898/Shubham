package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;

public class RegistrationPage 
{
	WebDriver driver;
	
	By fullName = By.name("name");
	By accemail = By.name("email");
	By accpassword = By.name("password");
	By register = By.cssSelector("form.create-form > div > button");
	

	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/*public String getPageTitle1()
	{
		return driver.getTitle();
	}*/
	
	public void enterfullName()
	{
		WebElement fname = driver.findElement(fullName);
		fname.sendKeys("Vijay Patil");
	}
	
	public void enterEmail()
	{	
		WebElement fieldset1 = driver.findElement(By.cssSelector("form.create-form > div > div:nth-child(4) > div:nth-child(2) > div.fieldset__field-wrapper > div.field.field--large"));
		fieldset1.click();
		
		WebElement email = fieldset1.findElement(accemail);
		email.click();
		email.sendKeys("shubh3@mailinator.com");
	}
	
	public void enterPassword()
	{
		WebElement fieldset2 = driver.findElement(By.cssSelector("form.create-form > div > div:nth-child(5) > div:nth-child(2) > div.fieldset__field-wrapper > div.field.field--large"));
		fieldset2.click();
		
		WebElement passwd = fieldset2.findElement(accpassword);
		passwd.click();
		passwd.sendKeys("123456");
	}
	
	public void clickRegister()
	{
		WebElement registers = driver.findElement(register);
		registers.click();
	}
}
