package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public  class Base implements ConfigFiles {

    public static WebDriver driver = null;

    static {
        System.setProperty(CHROME_KEY, CHROME_VALUE);
    }

    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.get("https://www.bookswagon.com");

    }

    @AfterMethod
    public void taerDown() {
        driver.close();
    }

}


