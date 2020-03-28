package script;

import base.Base;
import base.ConfigFiles;
import base.JSONReader;
import org.testng.annotations.*;
import pages.SearchBook;

import java.io.FileNotFoundException;

@Listeners()
public class SearchBookTest extends Base {

    @BeforeMethod
    public void setUp(){
        initialize();
    }

@DataProvider(name="BookName")
    public Object[][] passData() throws FileNotFoundException {
    Object[][] arr= JSONReader.getdata(ConfigFiles.FILEPATH,"BooksName",3,1);
    Object[][] arr1=new Object[3][3];
    int k=0,l=0;
    for (int i=0;i<3;i++) {
        for (int j=0; j<1;j++) {
            System.out.println(arr[i][j]);
            arr1[k][l]=arr[i][j];
            k++;
            l++;
        }

    }
    return arr;

}



    @Test(dataProvider = "BookName")
    public void givenMethodForSearchBook(String BookName) throws InterruptedException{
        SearchBook search = new SearchBook(driver);
        search.SearchBook(BookName);



    }
@AfterMethod
    public void tearDown(){
    driver.close();
}

}
