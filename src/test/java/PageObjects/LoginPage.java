package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
WebDriver driver;
	
	//constructor
  public  LoginPage(WebDriver driver)
    {
    	super(driver);
    }
    
    //locators 
    @FindBy(xpath="//input[@id='input-email']") WebElement txtEmailaddress;  
    @FindBy(xpath="//input[@id='input-password']") WebElement txtpassword;    
    @FindBy(xpath="//input[@value='Login']") WebElement btnlogin;
    
    //action methods
    public void setEmailAddress(String email)
    {
    	txtEmailaddress.sendKeys(email);
    }
    
    public void setPassword(String pwd)
    {
    	txtpassword.sendKeys(pwd);
    }
    public void clickLogin()  
    {
    	btnlogin.click();
    }
    
}
