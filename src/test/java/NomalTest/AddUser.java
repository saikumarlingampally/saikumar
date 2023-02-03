package NomalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AddUser {
    WebDriver driver;


    @BeforeTest
    public void logginSetUp()throws Throwable{
        System.setProperty("webdriver.chrome.driver","/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/chromedriver");
         driver= new ChromeDriver();
        driver.get("http://13.212.31.37:9063/login");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("adithya@thrymr.net");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        String cap= driver.findElement(By.xpath("//span[@id='maincaptcha']")).getText();
        // Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='captchainputfield']")).sendKeys(cap.replaceAll(" ",""));
        driver.findElement(By.xpath("//button[contains(text(),' Login ') and (@type='submit')]")).click();
        Thread.sleep(5000);
        //main user data
        driver.findElement(By.xpath("//a[contains(text(),'Users') and (@class='nav-link ng-star-inserted')]")).click();
        Thread.sleep(2000);

    }@Test
    public void addUser()throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10);

        driver.findElement(By.xpath("//button[contains(text(),' +Add User ')]")).click();

        driver.findElement(By.xpath("//input[@formcontrolname='first_name']")).sendKeys("kishore");

        driver.findElement(By.xpath("//input[@formcontrolname='last_name']")).sendKeys("kumar");

        driver.findElement(By.xpath("//input[@formcontrolname='nickName']")).sendKeys("Jugal");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("kishore@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys("1234");
        Thread.sleep(2000);
       Select unit=new Select(driver.findElement(By.xpath("//select[@formcontrolname='distanceUnit']")));
       unit.selectByVisibleText("Meters ");
//       for (){
//
//       }

        Select temperature=new Select(driver.findElement(By.xpath("//select[@formcontrolname='temperatureUnit']")));
        temperature.selectByVisibleText("Celsius (°C) ");
        //lable lo 3 elements unai
        Thread.sleep(5000);
       Select coutryselect=new Select(driver.findElement(By.xpath("//select[@formcontrolname='countryCode']")));
       coutryselect.selectByVisibleText("Denmark ");
       Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@formcontrolname='phone1']")).sendKeys("91458274521");
        Thread.sleep(5000);
        Select roles= new Select(driver.findElement(By.xpath("//select[@formcontrolname='role']")));
        roles.selectByVisibleText("Customer ");
        Thread.sleep(2000);
      Select language= new Select(driver.findElement(By.xpath("//select[@formcontrolname='preferredLanguage']")));
        language.selectByVisibleText("English ");
      Thread.sleep(2000);
        Select baseMap= new Select(driver.findElement(By.xpath("//select[@formcontrolname='baseMapCountry']")));
        baseMap.selectByVisibleText("Togo ");
        Thread.sleep(2000);
        //lable 2
        Select locationcountry= new Select( driver.findElement(By.xpath("//select[@formcontrolname='locationCountryCode']")));
        locationcountry.selectByVisibleText("IND ");
//        driver.findElement(By.xpath(""));


    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
