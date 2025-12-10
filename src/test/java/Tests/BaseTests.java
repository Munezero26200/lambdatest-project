package Tests;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class BaseTests {

    private WebDriver driver;
    protected HomePage homepage;
    @BeforeClass
    public void setUp(){
       driver = new ChromeDriver();
       driver.get("https://www.lambdatest.com/selenium-playground/");

        homepage = new HomePage(driver);

    }
}
