package Pages;


import BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends Baseclass {

    @FindBy(id ="bd-versions" )
    WebElement accuser;

    @FindBy(xpath ="//a[contains(text(),'Logout')]" )
    WebElement logbtn;
//
//    @FindBy(xpath ="" )
//    WebElement sai;
//
//    @FindBy(xpath ="" )
//    WebElement sai;
//
//    @FindBy(xpath ="" )
//    WebElement sai;


    public LogoutPage(){
        PageFactory.initElements(driver,this);
    }
    public void loggingOut()throws Throwable{
        accuser.click();
        accuser.click();

        logbtn.click();

    }

}
