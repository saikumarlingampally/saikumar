package NomalTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class WriteDate01 {
    public static void main(String[] args) throws Throwable{
//        String countries= "";
        // workbook--> sheet--> rows--> cells.
        XSSFWorkbook wb= new XSSFWorkbook();
        XSSFSheet sheet= wb.createSheet("countries");
        Object countries[][]={{"Country","Capital","Currency"},
                { "Argentina","Buenos" ,"Peso"},
                {"Armenia","Yerevan","Dram"},
                {"Australia",	"Canberra",	"Australian dollar"},
                {"Austria","Vienna	Euro" ,"formerly schilling"},
                { "Azerbaijan",	"Baku","Manat"},
                {"The Bahamas","Nassau","Bahamian dollar"},
        {"Bahrain",	"Manama",	"Bahrain dinar"},
        {"Bangladesh",	"Dhaka","Taka"},
        { "Barbados","Bridgetown","Barbados dollar"},
        {"Belarus","Minsk","Belorussian ruble"},
        {"Belgium","Brussels","Euro"},
        {"Belize","Belmopan","Belize dollar"},
        {"Benin","Porto-Novo","CFA Franc"},
        { "Bhutan"	,"Thimphu",	"Ngultrum"},
        { "Bolivia","La Paz" ,"Sucre (judicial)	Boliviano"},
        {"Bosnia and Herzegovina","Sarajevo","Convertible Mark"},
        {"Botswana","Gaborone","Pula"},
        {"Brazil","Brasilia","Real"},
        {"Brunei Bandar","Seri Begawan","Brunei dollar"},
        {"Bulgaria","Sofia","Lev"},
        {"Burkina Faso","Ouagadougou","CFA Franc"},
        {"Burundi","Gitega","Burundi franc"},
        };
       int row= countries.length;
       int col= countries[0].length;
        System.out.println(row);
        System.out.println(col);

        for(int r=0;r<row;r++){
           XSSFRow rows= sheet.createRow(r);
            System.out.println(rows);
            for (int c=0;c<col;c++){
               XSSFCell cells= rows.createCell(c);
               Object values=countries[r][c];
               if(values instanceof String)
                   cells.setCellValue((String)values);
               if(values instanceof Integer)
                   cells.setCellValue((Integer)values);
               if(values instanceof Boolean)
                   cells.setCellValue((Boolean)values);

            }
        }
        String filepath=".//reports//Bhuvana.xlsx";
        FileOutputStream ot= new FileOutputStream(filepath);
        wb.write(ot);
        ot.close();
        System.out.println("successfully done");
    }
}
