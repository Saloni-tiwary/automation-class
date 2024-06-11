package seleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
// navigate to facebook
//click on create new account button
//click on female radio button 
// verify that the radio button is enabled 
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		// navigate to facebook
        driver.get("https://www.facebook.com/");
        // 1st Method 
      //click on create new account button
        driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
//      //click on female radio button 
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@value='1']")).click();
//     // verify that the radio button is enabled 
//        System.out.println(driver.findElement(By.xpath("//input[@value='1']")).isEnabled());
//        //
        
        
        //2nd Method 
//        Thread.sleep(2000);
//        List<WebElement> radioButton= driver.findElements(By.xpath("//input[@type='radio']"));
//        System.out.println("Number of radio buttons "+ radioButton.size());
//        Thread.sleep(2000);
//        radioButton.get(0).click();//female click 
//        System.out.println(radioButton.get(0).isSelected());
//        //hard code not prefeble 
      // 3rd Method -- most preferrably 
        Thread.sleep(2000);
        List<WebElement> radioButton = driver.findElements(By.xpath("//label[@class='_58mt']"));//3
        System.out.println("Number of radio buttons "+ radioButton.size());//3
        String expRadioButton="Male";
        for(int i =0;i<radioButton.size();i++) {//0
        	//radioButton.get(0).getText().equalsIgnoreCase(expRadioButton)
        	if(radioButton.get(i).getText().equalsIgnoreCase(expRadioButton))
        		radioButton.get(i).click();
        	   Thread.sleep(5000);
              System.out.println("Radio Button Clicked");
             
        }
        
        
        driver.close();
        
        
        

	}

	
	

}
