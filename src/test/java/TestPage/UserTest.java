package TestPage;

import BaseClass.Baseclass;
import Pages.LoginPage;
import Pages.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest extends Baseclass {
    LoginPage loginPage;
    User user;
    @BeforeMethod
    public void setUp(){
        loginPage= new LoginPage();
        user= new User();
    }




    @Test
    public void verifingUser()throws Throwable{
        user.addingUser();

    }

}
