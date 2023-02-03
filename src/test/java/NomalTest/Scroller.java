package NomalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scroller {
    public static void main(String[] args)throws Throwable {

        System.setProperty("webdriver.chrome.driver", "/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://13.212.31.37:9063/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("adithya@thrymr.net");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        String cap = driver.findElement(By.xpath("//span[@id='maincaptcha']")).getText();
        System.out.println(cap);
        driver.findElement(By.xpath("//input[@id='captchainputfield']")).sendKeys(cap.replaceAll(" ",""));
        driver.findElement(By.xpath("//button[contains(text(),' Login ') and (@type='submit')]")).click();
        Thread.sleep(5000);

        // go to users--> add users--> go to country search (ok)
        driver.findElement(By.xpath("//a[contains(text(),'Users') and @class='nav-link ng-star-inserted']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(text(),' +Add User ')]")).click();

        Select country= new Select(driver.findElement(By.xpath("//select[@formcontrolname='baseMapCountry']")));

        JavascriptExecutor js= (JavascriptExecutor)(driver);
        js.executeScript("window.scroll(0,1000)");
        country.selectByVisibleText("Bahamas ");
//
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,100)");








    }
}

