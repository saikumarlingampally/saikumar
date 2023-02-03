package TestPage;

import BaseClass.Baseclass;
import Pages.ContainerVisibilityPage;
import Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContainerVisibilityTest extends Baseclass {
    LoginPage loginPage;

    ContainerVisibilityPage containerVisibilityPage;
    public ContainerVisibilityTest(){
        super();
    }
    @BeforeMethod
    public void setUp() throws Throwable {
        initilization();
        loginPage = new LoginPage();

    }



    @Test
        public void clickingOnContainerTab ()throws Throwable {
            Thread.sleep(8000);
            containerVisibilityPage.clickOnContainer();

        }
        @AfterMethod
    public void teardown(){
        driver.close();
        }

    }

