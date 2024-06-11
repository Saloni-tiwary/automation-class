package seleniumClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.time.Duration;


public class TakingScreenShots2 {

    TakeScreenShot1 t1 = new TakeScreenShot1();

    @BeforeMethod
    public void setup() {
        t1 = new TakeScreenShot1();
        t1.driver = new ChromeDriver();
        t1.driver.manage().window().maximize();
        t1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void doLogin() {
        // navigate to Facebook
        t1.driver.get("https://www.facebook.com/");
        // enter email
        t1.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcQ@gmail.com");
        // intentionally using incorrect xpath to trigger failure
        t1.driver.findElement(By.xpath("//input[@id='asdeftg']")).sendKeys("abcd");
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception {
        t1.takeSnapShot(result);
        t1.driver.quit();
    }
}

