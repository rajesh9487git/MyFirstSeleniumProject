package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	
	By email= By.xpath("//*[@id=\"user_email\"]");
	By pwd= By.xpath("//*[@id=\"user_password\"]");
	By submit= By.xpath("//*[@id=\"new_user\"]/div[3]/input");
	

	public WebElement emailid() {
		
		return driver.findElement(email);
	}
	
public WebElement password() {
		
		return driver.findElement(pwd);
	}


public WebElement submitButton() {
	
	return driver.findElement(submit);
}
	
}
