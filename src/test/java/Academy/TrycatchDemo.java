package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrycatchDemo {

	WebDriver driver;
	
		@Test
		public void alaunchingBrowser() {
		
			System.out.println("launching the browser");
		}
		
		
		@Test
		public void badding() {
			
			
		try {	
			int a=3;
			int b=0;
			int k= a/b;
			
		} catch(Exception e) {
			
			
				
				System.out.println(e.getMessage());
			}
			
		}
		

		@Test
		public void closingBrowser() {
			
		System.out.println("closing the browser");
		}
		
		
		
}
