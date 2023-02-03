package NomalTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Tables {
    public static void main(String[] args) throws Throwable {
        String data = "/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls";
        FileInputStream fi = new FileInputStream(data);
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        XSSFSheet sheet = wb.getSheetAt(0);

        int row = sheet.getLastRowNum();
//        System.out.println(row);
//        int cols= sheet.getRow(row).getLastCellNum();

        for (int i = 0; i <= row; i++) {
            XSSFRow rows = sheet.getRow(row);
            int col = sheet.getRow(row).getLastCellNum();

            for (int c = 0; c < col; c++) {
                XSSFCell cell = rows.getCell(c);
                System.out.println(cell.getStringCellValue());
            }
            System.out.println("|");
        }
    }
}

