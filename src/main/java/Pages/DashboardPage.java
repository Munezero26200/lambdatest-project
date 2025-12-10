package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    private WebDriver driver;

    @FindBy(id = "profile__dropdown")
    private WebElement profileIcon;

    public DashboardPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    public boolean isDashboardVisible(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profile__dropdown")));
        return profileIcon.isDisplayed();
    }

}
