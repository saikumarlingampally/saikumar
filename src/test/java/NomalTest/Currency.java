package NomalTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Currency {
    public static void main(String[] args)throws Throwable {
        FileInputStream fi= new FileInputStream("/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/Finance.xls");
        XSSFWorkbook wb= new XSSFWorkbook(fi);
        XSSFSheet st= wb.getSheetAt(0);
       int row= st.getLastRowNum();
        System.out.println(row);
        XSSFRow fRow= st.getRow(0);
        int colNum = -1;
        int colData= st.getRow(0).getLastCellNum();

        for(int  i=0; i<colData; i++){
            XSSFCell cell= fRow.getCell(i);

            if(cell.getStringCellValue().equalsIgnoreCase("country")){
                colNum = i;
                break;
            }
        }

        System.out.println("Column : "+colNum);

        if(colNum > -1){
            for (int r= 1;r<=row;r++){
                XSSFRow row1= st.getRow(r);
                int col= st.getRow(r).getLastCellNum();
                for (int c=colNum; c <=colNum;c++){
                    XSSFCell cell= row1.getCell(c);
                    System.out.println(cell.getStringCellValue());
                    break;

                }
                System.out.println();

            }//if(col=1,break,
        }


    }
}
