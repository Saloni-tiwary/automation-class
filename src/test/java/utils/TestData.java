package utils;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "loginDataFromExcel")
    public Object[][] getLoginDataFromExcel() throws Exception {
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData("C:\\Users\\HP\\eclipse-workspace\\seleniumClass\\Excel\\Sheet 1.XLSX", "Sheet1");
    }
}

