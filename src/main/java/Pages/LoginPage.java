package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By email= By.id("email");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterEmail(String emailText){
        driver.findElement(email).sendKeys(emailText);
    }
    public void enterPassword(String passwordText){
        driver.findElement(password).sendKeys(passwordText);
    }
    public DashboardPage clickLoginBtn(){
        driver.findElement(loginBtn).click();
        return new  DashboardPage (driver);
    }

}
