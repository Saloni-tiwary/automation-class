package seleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws Exception {
		//This was used in S3 to set the path of the driver 
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();// launch the browser 
		
		// Open the URL 
		driver.get("https://www.google.com");
	
		
		Thread.sleep(2000); // stops the opertion for the given time
		driver.manage().window().maximize();//Maximize the Window
		
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();//delete all cookies 
		
		Thread.sleep(1500);
		driver.navigate().to("https://www.facebook.com");//navigates to the provided url 
		
		Thread.sleep(1500);
		driver.navigate().refresh();//refresh the page 
		
		Thread.sleep(1500);
		driver.navigate().back();
		
		Thread.sleep(1500);
		driver.navigate().forward();
		
		Thread.sleep(1500);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1500);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		

	}

}
