package NomalTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/thrymr/Desktop/sai_kumar/Downloads/INTELLEj/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://13.212.31.37:9063/login");
        driver.manage().window().maximize();

    }
}
