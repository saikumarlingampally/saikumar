package NomalTest;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class ExcelDataReader {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        String c ="India" ;
        country("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls", c);

//        country("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls", c);
//        country("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls", c);
//        country("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls", c);
//        country("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls", c);
//        country("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls", c);
//        country("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls", c);

    }

    public static void country(String path, String country) throws IOException, InvalidFormatException{
        FileInputStream fs = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rows = sheet.getLastRowNum();

        for (int r = 0; r<= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            int cols = sheet.getRow(r).getLastCellNum();

            XSSFCell cell = row.getCell(0);

            if(cell.getStringCellValue() != null &&
                    cell.getStringCellValue().trim().equalsIgnoreCase(country)
            ){
                for (int c = 0; c < cols; c++) {
                    XSSFCell countryCell = row.getCell(c);
                    System.out.println(countryCell.getStringCellValue());
                    break;
                }
                //System.out.print("Yay country found -> "+cell.getStringCellValue());
                break;
            }

           /* for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
//                System.out.println();
                if(cell != null &&
                        cell.getCellType() != null){
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            break;
                    }
                    if(c == cols-1){
                        System.out.println();
                    }else{
                        System.out.print(" -> ");
                    }
                }
            }*/
        }
    }


}




