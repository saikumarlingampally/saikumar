package NomalTest;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.io.IOException;

public class DataExcel {
    public static void main(String[] args) throws Throwable {
        FileInputStream fs = new FileInputStream("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls");
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rows = sheet.getLastRowNum();
        System.out.println(rows);
        int cols = sheet.getRow(rows).getLastCellNum();
        System.out.println(cols);

        String a = "Currency";


        for (int r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);


            for (int c = 0; c <cols; c++) {
                XSSFCell cell = row.getCell(c);

                System.out.println(cell.getStringCellValue());

            }
            System.out.println();

            }


        }
    }


