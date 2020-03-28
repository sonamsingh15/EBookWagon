package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

public class SearchBook extends Base {

    @FindBy(xpath = "//input[@name=\"ctl00$TopSearch1$txtSearch\"]")
    WebElement searchBar;

    public SearchBook(WebDriver driver) {
        super();
    }

    public void SearchBook(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public void SearchBook(String bookName){
        searchBar.sendKeys(bookName);
    }


}
