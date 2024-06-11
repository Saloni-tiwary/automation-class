package seleniumClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://demo.automationtesting.in/Windows.html");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
	    driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();

	//Get the total number of tabs/window 
	    
	    Set<String> allWindowsID = driver.getWindowHandles();//extraction of the window/tab ID 
	    System.out.println(allWindowsID);//ID
	    
	    Iterator<String> windowID = allWindowsID.iterator(); // stores the extracted ID 
	    String win1= windowID.next();//ID return 
	    String win2 = windowID.next();//2nd window 
	    
	    //print the title of the parent tab
	    driver.switchTo().window(win1);// s
	    System.out.println("Parent window ID " +win1);
	    System.out.println(driver.getTitle());
	    
	    //url of child tab 
	    driver.switchTo().window(win2);
	    System.out.println("Child Tab ID "+ win2);
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(2000);
	    //driver.close();
	    driver.quit();
	}

}
