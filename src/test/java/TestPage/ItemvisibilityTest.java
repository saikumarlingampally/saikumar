package TestPage;

import BaseClass.Baseclass;
import Pages.ItemVisibilityPage;
import org.testng.annotations.Test;

public class ItemvisibilityTest extends Baseclass {
    ItemVisibilityPage itemVisibilityPage;

   @Test
    public void verifyingItemVisibility()throws Throwable{
        Thread.sleep(5000);
        itemVisibilityPage.itemVisibilityTab();


    }

}
