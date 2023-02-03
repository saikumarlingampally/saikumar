package NomalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ls
        Filter {
    public static void main(String[] args)throws Throwable{
        System.setProperty("webdriver.chrome.driver","/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/chromedriver");
        WebDriver driver= new ChromeDriver();
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
        // sub user data
        driver.findElement(By.xpath("//a[contains(text(),'Users ')]")).click();
        Thread.sleep(8000);
        List<WebElement> tdata= driver.findElements(By.xpath("//div[@class='ui-table-wrapper ng-star-inserted']//tbody[@class='ui-table-tbody']//tr"));
        //div[@class='ui-table-wrapper ng-star-inserted']//tbody[@class='ui-table-tbody']//tr
        System.out.println(tdata.size()+" web element size");
       for(int i =0; i < tdata.size()  ; i++){
           System.out.println(tdata.get(i).getText());
       }
       //       for(WebElement t : tdata) {
//           System.out.println(t.getText());
//
//       }
        Thread.sleep(9000);
        driver.quit();






    }
}
