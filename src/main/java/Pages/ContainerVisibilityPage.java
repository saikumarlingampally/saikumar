package Pages;

import BaseClass.Baseclass;
import Xpaths.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContainerVisibilityPage extends Baseclass {
    @FindBy(xpath = "//a[contains(@id,'pills-profile-tab')]")
    WebElement containerVisibilitytab;





    public ContainerVisibilityPage(){
        PageFactory.initElements(driver,this);
    }




    public void clickOnContainer()throws Throwable{
        Thread.sleep(9000);
        containerVisibilitytab.click();



    }

}
