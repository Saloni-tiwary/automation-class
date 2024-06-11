package seleniumClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Specify the location of the properties file 
		File src1 = new File("C:\\Users\\HP\\eclipse-workspace\\seleniumClass\\Repository\\config.properties");
		File src2 = new File("C:\\Users\\HP\\eclipse-workspace\\seleniumClass\\Repository\\locators.properties");
		File src3 = new File("C:\\Users\\HP\\eclipse-workspace\\seleniumClass\\Repository\\testdata.properties");
		
		// FileInputStream class loads the file 
		FileInputStream config1 = new FileInputStream(src1);
		FileInputStream locators1 = new FileInputStream(src2);
		FileInputStream testData1 = new FileInputStream(src3);

		//Properties class reads the properties file
		Properties config2 = new Properties();
		config2.load(config1);// read config.properties 
		Properties locators2 = new Properties();
		locators2.load(locators1);
		Properties testData2 = new Properties();
		testData2.load(testData1);
		
		
		
		
		WebDriver driver = new ChromeDriver();// object creation 
		// navigate to facebook
		 long implicitWaitSeconds = Long.parseLong(config2.getProperty("Wait"));//"10"
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitSeconds));
        driver.get(config2.getProperty("URL"));
        
        if (config2.getProperty("MaximizeWindow", "false").equalsIgnoreCase("true")) {
            driver.manage().window().maximize();
        }
        driver.findElement(By.xpath(locators2.getProperty("Email"))).sendKeys(testData2.getProperty("TestDataEmail"));
        driver.findElement(By.xpath(locators2.getProperty("Password"))).sendKeys(testData2.getProperty("TestDataPassword"));
		
		
		
		
	}

}
