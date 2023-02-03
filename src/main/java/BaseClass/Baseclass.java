package BaseClass;

import Utility.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.*;

public class Baseclass {

        public static WebDriver driver;
        public static Properties properties;
        public static Util util;

        public  Baseclass(){
            try{
                properties= new Properties();
                FileInputStream io =new FileInputStream("/home/thrymr/thrymr/Tetrapak/src/main/java/Config/Config.properties");
                properties.load(io);
            }  catch (FileNotFoundException e){
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }




        }
    public void initilization() throws Throwable{
        String browser= properties.getProperty("browser");

        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/chromedriver");
            driver=new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/geckodriver");
            driver= new FirefoxDriver();

        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
         util.waitControl();
         driver.get(properties.getProperty("url"));

    }

}

