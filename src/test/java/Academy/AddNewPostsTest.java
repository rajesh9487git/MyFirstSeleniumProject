package Academy;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.WordPressDashBoard;
import pageObjects.WordPressLandingPage;
import resources.base;

public class AddNewPostsTest extends base {
	
	

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
		l.password().sendKeys(prop.getProperty("pd"));
		l.submitbutton().click();
		
		WordPressDashBoard a= new WordPressDashBoard(driver);
		a.post().click();
		a.addnewposts().click();
		a.enterposttitle().sendKeys("Rajesh688");
		/*//JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//String script= "return document.getElementById('title-prompt-text').innerHTML='Rajesh123';";
		//js.executeScript(script);
		
		//a.enterpostbody().sendKeys("This is my first post, Thank you all");
*/		a.publishpost().click();
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		driver=null;
	}
	

	
}
