package NomalTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.Objects;

public class WritingDataExcel {

    public static void main(String[] args)throws Throwable {
        XSSFWorkbook wb= new XSSFWorkbook();
        XSSFSheet sheet=wb.createSheet("Emp Info");
        Object empdata[][]= {  {"empno", "Name", "Mobile Number"},
                               {101,"sai",798125487},
                               {102,"rangu",1265487954},
                               {103,"abhi",521487596},
                               {104,"krishna",25487965},
                               {105,"prashanth",2036504120}
                             };
        int rows= empdata.length;//6=-1
        int col=empdata[0].length;//3=-1
        System.out.println(rows);
        System.out.println(col);
        //using loop here
        for (int r=0; r<rows ; r++){
           XSSFRow row= sheet.createRow(r);
           for(int c=0;c<col;c++){
                 XSSFCell cell= row.createCell(c);
                Object value=empdata[r][c];
                if(value instanceof String)
                    cell.setCellValue((String)value);
                if(value instanceof Integer)
                    cell.setCellValue((Integer)value);
                if(value instanceof Boolean)
                    cell.setCellValue((Boolean) value);
            }
        }
        String filepath=".//reports//suvarna.xlsx";
        FileOutputStream output= new FileOutputStream(filepath);
        wb.write(output);
        output.close();
        System.out.println("successfully printed");
    }
}

