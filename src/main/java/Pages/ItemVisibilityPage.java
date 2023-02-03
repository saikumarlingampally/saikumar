package Pages;

import BaseClass.Baseclass;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemVisibilityPage extends Baseclass {
    @FindBy(xpath = "//a[contains(text(),'Item Visibility')]")
    WebElement itemtab;

//    @FindBy(xpath = "")
//    WebElement sai;
//
//    @FindBy(xpath = "")
//    WebElement sai;
//
//    @FindBy(xpath = "")
//    WebElement sai;
//
//    @FindBy(xpath = "")
//    WebElement sai;

    public ItemVisibilityPage(){
        PageFactory.initElements(driver,this);
    }
    public void itemVisibilityTab(){

        itemtab.click();

    }
}

