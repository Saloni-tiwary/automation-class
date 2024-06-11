package seleniumClass;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptInCode {

	public static void main(String[] args) throws Exception {
		
	//given
	WebDriver driver = new ChromeDriver();// object creation 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.facebook.com/");
    //javascriptexecutor interface 
    JavascriptExecutor newDriver = (JavascriptExecutor)driver;
    //when
    Thread.sleep(2000);
    newDriver.executeScript("document.getElementById('email').value='abc@gmail.com'");
    Thread.sleep(2000);
    newDriver.executeScript("document.getElementById('pass').value='abc@gmail.com'");
    //scroll down
    Thread.sleep(2000);
    newDriver.executeScript("window.scrollBy(0,300)");
    Thread.sleep(2000);
    //scroll up 
    newDriver.executeScript("window.scrollBy(0,-300)");
    
    
    
    
    
	}
}
