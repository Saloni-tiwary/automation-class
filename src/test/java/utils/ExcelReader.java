package utils;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public Object[][] getExcelData(String filePath, String sheetName) throws IOException {
        Object[][] data = null;
        try (FileInputStream fis = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheet(sheetName);
            int rowCount = sheet.getLastRowNum();
            data = new Object[rowCount][2]; // Assuming 2 columns for email and password

            for (int i = 1; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                
                // Handle the first cell (email)
                if (row.getCell(0).getCellType() == CellType.STRING) {
                    data[i - 1][0] = row.getCell(0).getStringCellValue();
                } else if (row.getCell(0).getCellType() == CellType.NUMERIC) {
                    data[i - 1][0] = String.valueOf((int)row.getCell(0).getNumericCellValue());
                }
                
                // Handle the second cell (password)
                if (row.getCell(1).getCellType() == CellType.STRING) {
                    data[i - 1][1] = row.getCell(1).getStringCellValue();
                } else if (row.getCell(1).getCellType() == CellType.NUMERIC) {
                    data[i - 1][1] = String.valueOf((int)row.getCell(1).getNumericCellValue());
                }
            }
        }
        return data;
    }
}
