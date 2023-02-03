package NomalTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Order extends Oms{

    Oms os= new Oms();
    JavascriptExecutor js;

    @Test(priority = 3)
    public void editData(){
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        driver.findElement(By.xpath("")).sendKeys();
    }
    //String excelpath=("");
//       XSSFWorkbook workbook = new XSSFWorkbook(fs);
//       XSSFSheet sheet = workbook.getSheet("Sheet3");
//        Row row = sheet.getRow(1);
//        Cell cell = row.getCell(0);
//        Row row1 = sheet.getRow(1);
//        Cell cell1 = row1.getCell(1);
//        System.out.println(sheet.getRow(0).getCell(1));
//        XSSFWorkbook workbook= new XSSFWorkbook();
//        XSSFSheet sheet= workbook.getSheetAt(3);
//        FileInputStream fi= new FileInputStream(excelpath);
//        XSSFWorkbook wb= new XSSFWorkbook(fi);
//        XSSFSheet sheet= wb.getSheetAt(0);






}
