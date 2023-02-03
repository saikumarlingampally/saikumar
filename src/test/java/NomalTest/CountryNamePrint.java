package NomalTest;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CountryNamePrint {
    public static void main(String[] args) throws Throwable {
        FileInputStream fs = new FileInputStream("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls");
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rows = sheet.getLastRowNum();
           Row r =  sheet.getRow(0);
//        int c = r.getLastCellNum();

        for (int i = 1;  i<=rows; i++) {
            XSSFRow row= sheet.getRow(rows);
            int col= sheet.getRow(rows).getLastCellNum();

            for (int j=col;j<col;j++){
                XSSFCell cell=row.getCell(col);
                System.out.println(col);
            }
        }
    }
}



