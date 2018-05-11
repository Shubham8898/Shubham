package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
	{
		
		WebDriver driver;
		
		By signUpButton = By.xpath("//*[@id='header']/div/div[3]/div[1]/a");
		
			public HomePage(WebDriver driver)
			{
				this.driver = driver;
			}
			
			public void clickSignUp()
			{
				WebElement signup = driver.findElement(signUpButton);
				signup.click();

			}
			
			public String getPageTitle()
			{
				return driver.getTitle();
			}
	

	}
