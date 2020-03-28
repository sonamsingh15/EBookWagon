package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortBookByPriceHighToLow extends Base {
    @FindBy(xpath = "//select[@id='ddlSort']")
    WebElement dropdownList;

    @FindBy(xpath = "//option[@value='Product_ActualPrice desc']")
    WebElement hightoLow;

//option[@value='Product_discount desc']

    public SortBookByPriceHighToLow(WebDriver driver){
    PageFactory.initElements(driver,this);
}
 public void selectLowToHigh() throws InterruptedException {
    dropdownList.click();
     Select select=new Select(hightoLow);
     select.deselectByVisibleText("Price: high to low");
     Thread.sleep(2000);
 }

}
