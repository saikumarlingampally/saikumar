package Pages;

import BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User extends Baseclass {

    @FindBy(xpath="//a[contains(text(),'Users')]")
    WebElement usersBtn;

    @FindBy(xpath="//button[contains(text(),' +Add User ')]")
    WebElement addUserbtn;

    @FindBy(xpath="//a[contains(text(),'Users ')]")
    WebElement usertab;

    @FindBy(xpath="//input[@formcontrolname='first_name']")
    WebElement fname;

    @FindBy(xpath="//input[@formcontrolname='last_name']")
    WebElement lname;

    @FindBy(xpath="//input[@formcontrolname='email']")
    WebElement email;

    @FindBy(xpath="//input[@formcontrolname='password']")
    WebElement password;

//    @FindBy(name="//input[@formcontrolname='password']")
//    WebElement password;

    @FindBy(xpath="//input[@formcontrolname='confirmPassword']")
    WebElement cpassword;

    @FindBy(name="//select[@formcontrolname='distanceUnit']")
    WebElement distance;

    @FindBy(name="//select[@formcontrolname='temperatureUnit']")
    WebElement temperature;

    @FindBy(name="//input[@formcontrolname='phone1']")
    WebElement phone1;

    @FindBy(name="//select[@formcontrolname='role']")
    WebElement userrole;

    @FindBy(name="//select[@formcontrolname='preferredLanguage']")
    WebElement selectlanguage;

    @FindBy(name="//select[@formcontrolname='baseMapCountry']")
    WebElement baseMap;

    @FindBy(name="//div[contains(text(),'Register')]")
    WebElement regbtn;

    @FindBy(xpath="//a[@class=' pull-right pointer']")
    WebElement closeicon;


    public User(){
        PageFactory.initElements(driver,this);
    }
    public void addingUser()throws Throwable{
        usersBtn.click();
        Thread.sleep(5000);
        addUserbtn.click();
        Thread.sleep(2000);
        closeicon.click();
        Thread.sleep(5000);
    }




}
