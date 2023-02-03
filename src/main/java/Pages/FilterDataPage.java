package Pages;

import BaseClass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterDataPage extends Baseclass {

    @FindBy(xpath="//a[contains(text(),'Users ')]")
    WebElement usersbtn;


//    @FindBy(xpath="//th[contains(text(),' Role ')]")
//    WebElement roles;

//
//    @FindBy(xpath="")
//    WebElement ai;

//    @FindBy(xpath="")
//    WebElement i;
//
//    @FindBy(xpath="")
//    WebElement a;
//
//    @FindBy(xpath="")
//    WebElement ais;



    public FilterDataPage(){
        PageFactory.initElements(driver,this);

    }
    public void verifyingMatchingData(){
        usersbtn.click();
        List<WebElement> planner= driver.findElements(By.xpath("//th[contains(text(),' Role ')]"));
        System.out.println(planner);




        }

    }

