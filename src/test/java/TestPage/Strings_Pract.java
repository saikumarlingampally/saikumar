package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Strings_Pract {
    public static void main(String[] args) throws Throwable{

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/chromedriver");
        driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/html/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//         driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("saikumar.lingampally@thrymr.net");
//        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("123456");
//        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//        System.out.println("Loggin successfull");
      String text=  driver.findElement(By.xpath("//h2[contains(text(),'Easy Learning with HTML \"Try it Yourself\"')]")).getText();
        System.out.println(text);

        boolean x = text.startsWith("ja");

        if(x) {
            String data[]=text.split(" ");
            // String []sr= orderid.split(" ");
            System.out.println(data[data.length-1]);
//        System.out.println(sr[sr.length-1]);
            String val=data[0];
            System.out.println(val);
            String val1=data[1];
            System.out.println(val1);
            String val2=data[2];
            System.out.println(val2);
            String val3=data[3];
            System.out.println(val3);
            String val4=data[4];
            System.out.println(val4);
            String val5=data[5];
            System.out.println(val5);
            String val6=data[6];
            System.out.println(val6);
            String val7 = val6.substring( 0,val6.length()-1);
            System.out.println(val7);
            String val8= val2.toLowerCase();
            System.out.println(val8);
            String val9 =val2.toUpperCase();
            System.out.println(val9);
        } else {
            System.out.println("SData not matching");
        }


//        String val15= val;
//        System.out.println();
//        String val16= val;
//        System.out.println();
        //        String val17= val;
//        System.out.println();
        //        String val18= val;
//        System.out.println();




Thread.sleep(2000);


        driver.close();

    }
}
