package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.WordPressDashBoard;
import pageObjects.WordPressLandingPage;
import resources.base;

public class WordPressLoginPageInvalidUserTest extends base {
	
	String expectedErrorMsg= "ERROR: The password you entered for the username admin is incorrect. Lost your password?";
	
	@BeforeMethod
	public void initialize() throws IOException {
		driver= initializeDriver();
		//log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		
	}
	@Test
	public void loginToWordPress() {
		
		WordPressLandingPage l= new WordPressLandingPage(driver);
		l.usernameid().sendKeys(prop.getProperty("un"));
		l.password().sendKeys(prop.getProperty("invalidpd"));
		l.submitbutton().click();
		String actualErrorMsg= l.errormsg().getText();
		System.out.println("actualErrorMsg");
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		driver=null;
	}
	

	
}
