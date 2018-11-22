package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WordPressLandingPage {
	
	WebDriver driver;
	
	public WordPressLandingPage(WebDriver driver) {
		
		this.driver= driver;
	}

	
	By username= By.xpath("//*[@id=\"user_login\"]");
	By pwd= By.xpath("//*[@id=\"user_pass\"]");
	By submit= By.xpath("//*[@id=\"wp-submit\"]");
	By error= By.xpath("//*[@id=\"login_error\"]");
	
	
	public WebElement usernameid() {
		
		return driver.findElement(username);
	}
	
	
public WebElement password() {
		
		return driver.findElement(pwd);
	}


public WebElement submitbutton() {
	
	return driver.findElement(submit);
}
	
public WebElement errormsg() {
	
	return driver.findElement(error);
}

	
}
