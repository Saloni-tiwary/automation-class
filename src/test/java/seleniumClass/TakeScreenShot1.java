package seleniumClass;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;
public class TakeScreenShot1 {

WebDriver driver ;


public void takeSnapShot(ITestResult result) throws Exception{
	if(ITestResult.FAILURE == result.getStatus()) {
//Convert web driver object to TakeScreenshot
TakesScreenshot scrShot =(TakesScreenshot)driver;
//Call getScreenshotAs method to create image file
File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
File DestFile=new File("./screenshots/" + result.getName() + ".png");
//Copy file at destination
FileUtils.copyFile(SrcFile, DestFile);
System.out.println(result.getName()+ " Screenshot captured");
}
}
}