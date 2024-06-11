package seleniumClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Assertion1 {
	 WebDriver driver;
	 @BeforeMethod
	public void navigateToURL() {
		   driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://www.facebook.com/");
	 }
	 @Test
	 public void validateTextOnLandingPage() {
		 String expectedText="Facebook helps you connect and share with the people in your life.";	 
		 Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'connect')]")).isSelected());
//		String actualText= driver.findElement(By.xpath("//h2[contains(text(),'connect')]")).getText();
//		Assert.assertEquals(actualText, expectedText);
		System.out.println("The test case passed");
	 }
	 @AfterMethod
    public void closeBrowser() {
    	driver.close();
    }
	 
}
