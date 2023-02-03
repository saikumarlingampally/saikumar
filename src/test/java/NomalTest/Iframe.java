package NomalTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Iframe {
    public static void main(String[] args) throws Throwable{
        System.setProperty("webdriver.chrome.driver","/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/sql/sql_and_or.asp");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        JavascriptExecutor js= (JavascriptExecutor)(driver);
        js.executeScript("window.scroll(0,1000)");
        driver.findElement(By.className("w3-responsive"));
        //table xpath
       // driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']"));
        //table[@class='ws-table-all notranslate']//tbody//tr[61]//td[3]
       WebElement fetch = driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr[61]"));
       Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", fetch);
        System.out.println(fetch);
//        Actions act= new Actions(driver);
//        act.moveToElement(fetch).perform();
        Date date= new Date();
        System.out.println(date);
        File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot/firstscree.png"));


    }
}


