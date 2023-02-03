package TestPage;

import BaseClass.Baseclass;
import Pages.LoginPage;
import Pages.LogoutPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends Baseclass {
    LoginPage loginPage;
            LogoutPage logoutPage;

    @BeforeMethod
    public void setUp(){


        logoutPage = new LogoutPage();


    }@Test
    public void verifyingLogOutPage()throws Throwable{
        Thread.sleep(2000);
        logoutPage.loggingOut();
        Thread.sleep(2000);
    }
}
