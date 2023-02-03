package Pages;

import BaseClass.Baseclass;
import Xpaths.BasicFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {
    @FindBy(name ="userId")
    WebElement enter_email;
    @FindBy(id ="password-field")
    WebElement password;

    @FindBy(name ="captcha")
    WebElement captcha_place;

    @FindBy(id ="maincaptcha")
    WebElement captcha_main;

    @FindBy(xpath ="//button[@class='btn btn-theme btn-login btn-block']")
    WebElement loginButton;

    @FindBy(xpath = "//img[@src='../assets/images/logo.png']")
    WebElement img;


////img[@src='../assets/images/logo.png']
    public LoginPage (){
        PageFactory.initElements(driver,this);
    }



    public void LoggingIn()throws Throwable{
        enter_email.sendKeys("adithya@thrymr.net");

        Thread.sleep(5000);
        password.sendKeys((properties.getProperty("password")));
        System.out.println(captcha_place);
        String cap= captcha_main.getText();
        System.out.println(cap);
        captcha_place.sendKeys(cap.replaceAll(" ",""));
        loginButton.click();

    }
    public void dashBoard(){


        if(img.isDisplayed())
        {
            System.out.println("welcome to dashboard");
        }else  {
            System.out.println("Sorry Invalid user name");
        }


    }

    public void title(){
      String titlename= driver.getTitle();
      if(titlename.equals("TETRAPAK")){
          System.out.println("pass::"+titlename);
      }else
        System.out.println("fail::"+titlename);

    }


}
