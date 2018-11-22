package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.WordPressLandingPage;
import resources.base;

public class WordPressLoginPageTest extends base {
	
	
	
	String etitle="Dashboard ‹ Wordpress Demo Site at Demo.Center — WordPress";

	@BeforeMethod
	public void initialize() throws IOException {
		driver= initializeDriver();
		//log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		
	}
	@Test
	public void loginToWordPress() {
		
		//String logincredentials=prop.getProperty("un");
		
		
		
		WordPressLandingPage l= new WordPressLandingPage(driver);
		l.usernameid().sendKeys(prop.getProperty("un"));
		l.password().sendKeys(prop.getProperty("pd"));
		l.submitbutton().click();
		String atitle=driver.getTitle();
		//System.out.println(atitle);
		Assert.assertEquals(atitle, etitle);
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		driver=null;
	}
	

	
}
