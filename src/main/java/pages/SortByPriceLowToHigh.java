package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortByPriceLowToHigh extends Base {

    @FindBy(xpath = "//select[@id='ddlSort']")
    WebElement dropdownList;
    @FindBy(xpath = "//option[@value='Product_discount desc']")
    WebElement lowToHigh;


    public SortByPriceLowToHigh(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void selectDropdownList() throws InterruptedException{
        Select select=new Select(lowToHigh);
        select.deselectByVisibleText("Price:low to high");
        Thread.sleep(2000);
    }

}
