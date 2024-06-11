package seleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		// navigate to facebook
        driver.get("https://www.facebook.com/");
      //click on create new account button
        driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
        Thread.sleep(2000);
        
        //1 way 
        List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']//option"));
        System.out.println("Number of dropdown values " +birthMonth.size());
        birthMonth.get(8).click();//sep

        
       //2nd Way
        WebElement birthMonth1= driver.findElement(By.xpath("//select[@id='month']"));// stores node
        Select month = new Select(birthMonth1);
        Thread.sleep(2000);
        month.selectByVisibleText("Apr");//apr
        Thread.sleep(2000);
        month.selectByValue("10");//oct
        Thread.sleep(2000);
        month.selectByIndex(11);//dec
        System.out.println(month.getFirstSelectedOption().getText());// returns the current 
        
        //3rd way 
        List<WebElement> dropdown= month.getOptions();
        String monthName="Sep";
        for(int i=0;i<dropdown.size();i++) {
        	if(dropdown.get(i).getText().equalsIgnoreCase(monthName)) {
        		dropdown.get(i).click();
                System.out.println("Desired month Clicked");
        	}
        }
        
        //4th way
        birthMonth1.sendKeys("Jul");
        
        //5th way 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
        
        
        //Deselect works for multiselect dropdown 
        month.deselectByValue(monthName);
        month.deselectByVisibleText(monthName);
        month.deselectByIndex(2);
	}
	

}
