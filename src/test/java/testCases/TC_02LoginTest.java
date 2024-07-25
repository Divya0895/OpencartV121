package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_02LoginTest extends BaseClass
{

	@Test(groups={"Sanity","Master"})
	public void verify_login_page()
	{
		logger.info("Starting TC_02LoginTest");
		logger.debug("Capturing application debug logs");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on my account link");
		
		hp.clickLogin();
		logger.info("Clicked on login link under my account");
		
		//LoginPage
		LoginPage lp=new LoginPage(driver);
		logger.info("entering valid email and password");
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		logger.info("clicked on login ");
		
		//MyAccountPage
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		Assert.assertEquals(targetPage,true,"login failed");
		}
		catch(Exception e )
		{
			Assert.fail();
		}
		logger.info("Finished TC_02LoginTest");
	}

}
