package seleniumClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://paytm.com/");
	    driver.findElement(By.xpath("//span[text()='Sign In']")).click();
int allFrames = driver.findElements(By.tagName("iframe")).size();
System.out.println("Total number of frames " +allFrames);
	    
for(int i=0;i<allFrames;i++) {
driver.switchTo().frame(i);
driver.findElement(By.xpath("//a[contains(@href,'privacy.html')]")).click();
}
	}

}
