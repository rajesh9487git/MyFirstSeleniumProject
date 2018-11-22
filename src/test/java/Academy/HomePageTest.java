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

public class HomePageTest extends base {
	
	private static Logger log =LogManager.getLogger(base.class.getName());
	String etitle="Dashboard ‹ Wordpress Demo Site at Demo.Center — WordPress";


	@BeforeMethod
	public void initialize() throws IOException {
		driver= initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@Test(dataProvider="getdata")
	public void basepagenavigation(String UserName, String Pwd) throws IOException {
		//driver= initializeDriver();
		//driver.get(prop.getProperty("url"));
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage l1= new LoginPage(driver);
		l1.emailid().sendKeys(UserName);
		l1.password().sendKeys(Pwd);
		l1.submitButton().click();
		
		log.info("Username and password validate");
		
		
			
			
		
		
		
		
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data= new Object[2][2];
		data[0][0]= "nonrestricteduser@gmail.com";
		data[0][1]= "123456";
		
		data[1][0]= "restricteduser@gmail.com";
		data[1][1]= "12345678";
		
		return data;
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		driver=null;
	}
	

	
}






















