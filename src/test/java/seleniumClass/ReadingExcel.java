package seleniumClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		//specifying the location
		File src = new File("C:\\Users\\HP\\eclipse-workspace\\seleniumClass\\Excel\\Sheet 1.XLSX");
		
		//load File 
		
		FileInputStream workBook = new FileInputStream(src);
		
		//load workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(workBook);
		//load sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(3).getCell(0).getNumericCellValue());
		double cellValue = sheet.getRow(3).getCell(0).getNumericCellValue();
		System.out.println((int)cellValue);
		
		// Total number of rows 
		System.out.println(sheet.getPhysicalNumberOfRows());
		// Total number of columns 
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		
		WebDriver driver = new ChromeDriver();// object creation 
		driver.manage().window().maximize();
		// navigate to facebook
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.facebook.com/");
        String email = sheet.getRow(1).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		

	}

}
