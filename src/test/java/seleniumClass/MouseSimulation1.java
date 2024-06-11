package seleniumClass;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.flipkart.com/");
	    // Web element reference 
	   WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
	   WebElement mobiles = driver.findElement(By.xpath("//span[text()='Mobiles']"));
	   Actions act = new Actions(driver);
	   // move hover 
	   act.moveToElement(electronics).build().perform();
	   
	   //keyboard simulation 
	   act.sendKeys(mobiles, Keys.ENTER).build().perform();
	   System.out.println("Mobiles Option clicked");
	   

	}

}
