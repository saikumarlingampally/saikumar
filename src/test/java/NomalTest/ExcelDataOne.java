package NomalTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelDataOne {
    public static void main(String[] args) throws Throwable {
        FileInputStream fi = new FileInputStream("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls");
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        XSSFSheet sheet = wb.getSheetAt(0);

        int rows = sheet.getLastRowNum();
        System.out.println(rows);
        int col = sheet.getRow(0).getLastCellNum();

        for (int r = 0; r < rows; r++) {
            XSSFRow row = sheet.getRow(r);
            for (int c = 0; c <= col; c++) {
                XSSFCell cell = row.getCell(col);

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

            }
            System.out.println();

        }
    }
}
