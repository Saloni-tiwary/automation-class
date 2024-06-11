package seleniumClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    
	    driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	    driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	    
	    String alertText = driver.switchTo().alert().getText();//actual result 
	    System.out.println(alertText);
	    String expText = "Press a Button !";
	    if(alertText.equals(expText))
	    {
	    	System.out.println("Alert text verified");
	    }
	    else
	    {
	    	System.out.println("validation failed");
	    }
	    Thread.sleep(2000);
	    // accept method is used to accept the alert 
	    driver.switchTo().alert().accept();
	    System.out.println("Alert accepted");
	    
	    // dismiss method is used to cancel the alert
	    driver.switchTo().alert().dismiss();
	    System.out.println("alert dismissed");

	    
	}

}
