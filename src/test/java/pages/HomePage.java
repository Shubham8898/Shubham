package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_class.BaseClass;

public class HomePage extends BaseClass
	{
		
	private By signUpButton = By.xpath("//*[@id='header']/div/div[3]/div[1]/a");
		
			public HomePage(WebDriver driver)
			{
				this.setDriver(driver);
			}
			
			public void clickSignUp()
			{
				setWb(getDriver().findElement(signUpButton));
				getWb().click();

			}
			
	}
