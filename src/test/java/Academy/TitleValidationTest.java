package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


public class TitleValidationTest extends base {
	
	private static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeMethod
	public void initialize() throws IOException {
		driver= initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		
	}

	String etitle="FEATURED COURSES123";
	
	
	@Test
	public void titlevalidation() throws IOException {
		
		LandingPage l= new LandingPage(driver);
		String atext= l.getTitle().getText();
		boolean homeTabStatus= l.homeTab().isDisplayed();
		
		Assert.assertEquals(etitle, atext);
		Assert.assertTrue(homeTabStatus);
		log.info("Title is validate");
		
	}
	
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		driver=null;
	}
	
	
}






















