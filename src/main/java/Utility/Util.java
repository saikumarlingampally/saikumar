package Utility;

import BaseClass.Baseclass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Util extends Baseclass {
    ExtentReports extentReports;

    ExtentSparkReporter extentSparkReporter;

    public void reports(){
        String path= System.getProperty("user.dir")+"//reports//index.html";
        ExtentSparkReporter repors= new ExtentSparkReporter(path);
        repors.config().setDocumentTitle("Sai Kumar");
        repors.config().setReportName("Lingampally");


        extentReports= new ExtentReports();
//        extentReports.createTest("");
        extentReports.attachReporter(repors);
        extentReports.setSystemInfo("sai","kumar");

    }
    public void screenShot()throws Throwable{
        String scrnshot= System.getProperty("user.dir")+"//screenshot//loginpage.jpg";
                Date date = new Date();
        System.out.println(date);
        File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File(".//screenshot/"));



//        File file= (TakesScreenshot(driver)).get

    }
    public void waitControl()throws Throwable{
//        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
//        driver.manage().timeouts().implicitlyWait(Duration.of(4, ChronoUnit.SECONDS));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

    }
}
