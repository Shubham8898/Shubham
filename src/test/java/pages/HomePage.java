package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_class.RegistrationBaseClass;

public class HomePage extends RegistrationBaseClass
	{
		
	By signUpButton = By.xpath("//*[@id='header']/div/div[3]/div[1]/a");
		
			public HomePage(WebDriver driver)
			{
				this.driver = driver;
			}
			
			public void clickSignUp()
			{
				wb = driver.findElement(signUpButton);
				wb.click();

			}
			
	}
