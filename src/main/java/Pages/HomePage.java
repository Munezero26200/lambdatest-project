package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
      this.driver = driver;
    }
    private void clickLink(String text){
        driver.findElement(By.linkText(text)).click();
    }

    public LoginPage clickLoginPage(){
        clickLink("Login");
        return new LoginPage(driver);
    }
    public JavaScriptAlertPage clickJavaScriptAlert(){
        clickLink("Javascript Alerts");
        return new JavaScriptAlertPage(driver);
    }
}
