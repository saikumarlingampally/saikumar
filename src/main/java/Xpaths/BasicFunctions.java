package Xpaths;

import org.openqa.selenium.By;

public class BasicFunctions {

    //filter icon and search icon
    public static By Filter = By.xpath("//li[@class='nav-item pointer ']");
    // Search
    public static By Search = By.xpath("//input[contains(@name,'search')]");
    //> icon on map screen
    public static By Mapview = By.xpath("//i[@class='fa fa-chevron-right ng-star-inserted']");
    // Card dropdown icon
    public static By Dropicon = By.xpath("//img[@class=\"img img-fluid collapse-icon\"]");
    //Clear filter function
    public static By Clearfilter = By.xpath("//button[contains(text(),'Clear Filter')]");



    //Vechile Visibility ----  Actions
    //rout icon
    public static By Rout = By.xpath("//img[contains(@title,'Routes')]");
    //link icon
    public static By Link_iocn = By.xpath("//img[contains(@title,'Track & trace')]");
    //Progress Bar
    public static By Progress = By.xpath("//div[@class='progress-border']");







    // Container Visibility

    //Add Events


    //Item Visibility






    //Actions

    //Close Shipment
    public static By Close = By.xpath("//button[contains(text(),' Close Shipment ')]");


    //Pagenation depend on the page starts from index values
    public static By page_nation = By.xpath("//a[@class='ui-paginator-page ui-paginator-element ui-state-default ui-corner-all ng-star-inserted'][2]");


}
