package Pages;

import BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VechileVisibilityPage extends Baseclass {
    @FindBy(xpath = "")
    WebElement sai;

    @FindBy(xpath = "")
    WebElement shivas;

//    @FindBy(xpath = "")
//    WebElement ;
//
//    @FindBy(xpath = "")
//    WebElement ;
//
//    @FindBy(xpath = "")
//    WebElement sai;
//
//    @FindBy(xpath = "")
//    WebElement sai;
//
//    @FindBy(xpath = "")
//    WebElement sai;


    public VechileVisibilityPage(){
        PageFactory.initElements(driver,this);
    }

//    public void


}
