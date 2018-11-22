package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WordPressDashBoard {
	
	WebDriver driver;
	
	public WordPressDashBoard(WebDriver driver) {
		
		this.driver= driver;
	}

	
	By posts= By.xpath("//*[@id=\"menu-posts\"]/a/div[3]");
	By addnew= By.xpath("//*[@id=\"menu-posts\"]/ul/li[3]/a");
	By entertitle =By.id("title");
	By enterbody= By.xpath("//*[@id=\"tinymce\"]/p");
	By publish= By.xpath("//*[@id=\"publish\"]");
	
	
	public WebElement post() {
		
		return driver.findElement(posts);
	}
	
	
public WebElement addnewposts() {
		
		return driver.findElement(addnew);
	}


public WebElement enterposttitle() {
	
	return driver.findElement(entertitle);
}
	
public WebElement enterpostbody() {
	
	return driver.findElement(enterbody);
}

public WebElement publishpost() {
	
	return driver.findElement(publish);
}

	
}
