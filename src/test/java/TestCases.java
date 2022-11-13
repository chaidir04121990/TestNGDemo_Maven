import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCases {
    WebDriver driver=null;
    ////


    @Test(priority = 1)
    void Test1(){
//        String Title = driver.getTitle();
//        Integer Title_Length = driver.getTitle().length();
        System.out.println("its Test1");
        System.setProperty("webdriver.chrome.driver", "/Users/chaidir/eclipse/java-2021-06/Chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        driver.get("https://www.sekolahqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        System.out.println("Title: "+driver.getTitle());
        System.out.println("length: "+driver.getTitle().length());
        System.out.println("page source: "+driver.getPageSource());
        System.out.println("page source length: "+driver.getPageSource().length());

        driver.close();
    }
    @Test(priority = 2)
    void Test2(){
        System.out.println("its Test2");
    }
}
