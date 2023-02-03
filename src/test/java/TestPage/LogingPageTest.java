package TestPage;

import BaseClass.Baseclass;
import Pages.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;

public class LogingPageTest extends Baseclass {


    LoginPage loginPage;
    Properties properties;
    ExtentReports extentReports;





    public LogingPageTest(){
        super();


    }
    @BeforeMethod
    public  void setup() throws Throwable {
        //Extent reports, Extent SparkReports
        String path= System.getProperty("user.dir")+"//reports//index.html";
        ExtentSparkReporter repo= new ExtentSparkReporter(path);
        repo.config().setReportName("Sai Kumar");
        repo.config().setDocumentTitle("lingampally");


        extentReports= new ExtentReports();
        extentReports.attachReporter(repo);
        extentReports.setSystemInfo("Tester"," Sai kumar");




        initilization();
        loginPage= new LoginPage();
        properties= new Properties();




    }
    @Test
    public void verifyingLoginPageTest()throws Throwable {
        extentReports.createTest("Login successful");

        loginPage.LoggingIn();
        Thread.sleep(5000);
        loginPage.dashBoard();
        loginPage.title();
        Thread.sleep(8000);
        extentReports.flush();
        Reporter.log("Successfully login",true);

    }

}

