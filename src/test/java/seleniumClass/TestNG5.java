package seleniumClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG5 {

	WebDriver driver;
	
	@BeforeClass
	public void setBrowserEnvironment() {
	driver = new ChromeDriver();// object creation 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	}
	
   @DataProvider
   public Object[][] dataSet() throws Exception{
	   Object arr[][] = new Object[3][2];
	   
	   
		File src3 = new File("C:\\Users\\HP\\eclipse-workspace\\seleniumClass\\Repository\\testdata.properties");
		FileInputStream testData1 = new FileInputStream(src3);
		Properties testData2 = new Properties();
		testData2.load(testData1);
		
	   arr[0][0]=testData2.getProperty("TestDataEmail");
	   arr[0][1]=testData2.getProperty("TestDataPassword");
	   
	   arr[1][0]="Username2";
	   arr[1][1]="Password2";
	   
	   
	   arr[2][0]="Username3";
	   arr[2][1]="Password3";
	   
	   return arr;
   }
   
	@Test(dataProvider="dataSet")
    //enter email
	public void loginCheck(String username, String password) throws Exception {
	driver.findElement(By.xpath("//input[@id='email']")).clear();
	driver.findElement(By.xpath("//input[@id='pass']")).clear();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}
	
	@AfterClass
	
	public void closingBrowser() {
		driver.close();
	}
	
	
}
