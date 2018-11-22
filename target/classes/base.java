package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class base {
	
	 public static WebDriver driver;
	 public Properties prop;
	 //public JavascriptExecutor js;
		
	
	public WebDriver initializeDriver() throws IOException {
		
		
		 prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\inrrao\\eclipseOxyGen-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:/seleniumRelatedSoftwares/chromedriver.exe");
			 driver= new ChromeDriver();
		
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:/seleniumRelatedSoftwares/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//js= (JavascriptExecutor)driver;
		
		return driver;
		
	}
	
	
	public String getApplicationUrl() {
		
		
		String url= prop.getProperty("url");
		//System.out.println(url);
		return url;
		
	}
	
	
	public void getScreenshots(String result) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\UdemySeleniumVideos&Docs\\"+result+"screenshot.png"));
	}
	
	
	

}
