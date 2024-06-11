package seleniumClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropIFrame {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://jqueryui.com/draggable/");
	    //I frame handling using index 
	    driver.switchTo().frame(0);
	    System.out.println("Moved to iframe");
	    //control goes back to main frame
	    //driver.switchTo().parentFrame();
	    WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement drop = driver.findElement(By.id("droppable"));
	    Thread.sleep(2000);
	    Actions act = new Actions(driver); 
	    //act.dragAndDrop(drag, drop).build().perform();
	    // we drag and element to the specified location depending on the coordinates provided
	    act.dragAndDropBy(drag, 100, 60).build().perform();
	    
	    			    
	    
	}

}
