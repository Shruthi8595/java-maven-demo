package tesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass {

    public static WebDriver driver;

    @BeforeMethod
    public void launchDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\Documents\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void Test1() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Test 1 title is "+driver.getTitle());
    }

    @Test
    public void Test2() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Test 2 title is "+driver.getTitle());
    }

    @Test
    public void Test3() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Test 3 title is "+driver.getTitle());
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
