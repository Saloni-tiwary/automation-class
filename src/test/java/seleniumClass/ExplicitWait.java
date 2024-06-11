package seleniumClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		// navigate to facebook
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.facebook.com/");
        
        //enter email
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcQ@gmail.com");
        
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
        
        
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
        
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("passContainer")));
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
        

	}

}
