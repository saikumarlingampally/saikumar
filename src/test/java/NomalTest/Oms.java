package NomalTest;

import Utility.Util;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Oms extends Util {

    WebDriver driver;
    JavascriptExecutor js;
    public static String store;
    Util util;


    @BeforeTest
    public void initilization() {
        System.setProperty("webdriver.chrome.driver", "/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://13.212.31.37:1812/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("saikumar.lingampally@thrymr.net");
        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        Reporter.log("Loggin Successful", true);
    }

    @Test(priority = 0)
    public void createOrder() throws Throwable {
        Thread.sleep(5000);
        //cost center
        driver.findElement(By.xpath("//input[@name='costCenter']")).sendKeys("123");

        driver.findElement(By.xpath("//input[@name='shipToNumber']")).sendKeys("1234");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@data-toggle='tooltip']")).click();
        Thread.sleep(8000);
        WebElement radio1 = driver.findElement(By.xpath("//input[@id='companyCard2']"));
        radio1.click();
        radio1.click();
        //save button
        driver.findElement(By.xpath("//div[@id='companyModel']//div[@class='modal-dialog modal-lg']//div[@class='modal-content']//div[@class='col-md-6']//button[@class='button button2']")).click();
        Thread.sleep(2000);
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @ng-reflect-name=\"'description'+0\"]")).sendKeys("1254");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @ng-reflect-name=\"'quantity'+0\"]")).sendKeys("145875");
        Thread.sleep(2000);
        Select drop_meter = new Select(driver.findElement(By.xpath("//select[@id=\"select+0\"]")));
        drop_meter.selectByVisibleText("METER ");
        Thread.sleep(2000);
        driver.findElement(By.name("isTermsAndConditions")).click();
        Thread.sleep(2000);
//        Clicking on save button
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        Thread.sleep(10000);
        // click on submit button
//        driver.findElement(By.xpath(" //button[contains(text(),'Submit')]")).click();
//               driver.findElement(By.xpath("//button[contains(text(),'YES')]")).click();
//               Thread.sleep(9000);
//              driver.findElement(By.xpath("")).click();
        Reporter.log("Script 1 run successfully", true);
        //        driver.findElement(By.xpath("")).click();
        //        driver.findElement(By.xpath("")).click();
    }

    @Test(priority = 1)
    public void capturingOrderID() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String orderid = driver.findElement(By.xpath("//p[contains(text(),'order is created successfully .Your order id is')]")).getText();
        System.out.println(orderid);
        Thread.sleep(9000);
        String[] sr = orderid.split(" ");
        System.out.println(sr[sr.length - 1]);
        store = sr[sr.length - 1];
        String val = sr[0];
        String val2 = sr[1];
        String val3 = sr[2];
        String val4 = sr[3];
        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(store);
//        driver.findElement(By.xpath("//div[@class='modal-content width-100']//button[contains(text(),'Close') and @class='btn btn-secondary']")).click();
        driver.findElement(By.xpath("//div[@class='modal-footer']//button[contains(text(),'Close')]")).click();
        Reporter.log("successfull 2 runed");
    }

    @Test(priority = 2)
    public void modifyOrder() throws Throwable {
//        util= new Util();
//        util.waitControl();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(@ng-reflect-router-link,'/order/modify')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='c']")).sendKeys(store);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='c']")).sendKeys(Keys.ENTER);

        Reporter.log("successfully 3 script is runned");

    }
    @Test(priority = 3)
    public void editData()throws Throwable{
        Thread.sleep(5000);
        js.executeScript("window.scrollTo(document.body.scrollDown)");
        Thread.sleep(5000);
        Reporter.log("finally scroll down");
    }
//    @AfterTest
//    public void teardown(){
//        driver.close();
//        Reporter.log("successfully tear down");
//    }


}
