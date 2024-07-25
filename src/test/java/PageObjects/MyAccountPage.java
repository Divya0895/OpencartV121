package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	WebDriver driver;
	public MyAccountPage (WebDriver driver)
	{
		super(driver);
	}
    
	@FindBy(xpath="//h2[normalize-space()='My Account']")WebElement msgHeading;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")WebElement lnklogout;
	
	public boolean isMyAccountPageExists() //MyAccount Page heading display status
	{
		try
		{
			return(msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	 
	public void clickLogout()
	{
		lnklogout.click();
	}
}