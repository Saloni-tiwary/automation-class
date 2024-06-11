package seleniumClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How Stuff works");
		
		//handling autosuggestions 
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i =0; i<autoSuggestions.size();i++) {
			String expSuggestion = "how stuff works quiz";
			if(autoSuggestions.get(i).getText().equalsIgnoreCase(expSuggestion)) {
				autoSuggestions.get(i).click();
			}
		}
	}

}
