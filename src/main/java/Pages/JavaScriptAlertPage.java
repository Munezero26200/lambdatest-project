package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {

    private WebDriver driver;
    private By alertsBtn = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/div[1]/p/button");
    private By confirmBtn = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/div[2]/div/p[1]/button");
    private By confirmationTxt = By.id("confirm-demo");
    private By promtAlertBtn = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/div[3]/p[1]/button");

    public JavaScriptAlertPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickJavaScriptAlertsBtn(){
        driver.findElement(alertsBtn).click();
    }
    public String getText(){
        return driver.switchTo().alert().getText();
    }
    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }
    //Confirm box
    public void clickJavaScriptConfirmBtn(){
        driver.findElement(confirmBtn).click();
    }

    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String resultText(){
        return driver.findElement(confirmationTxt).getText();
    }
    //Prompt alert
    public void clickPromptAlertBtn(){
        driver.findElement(promtAlertBtn).click();
    }
    public void setPromptTxt(String text){
         driver.switchTo().alert().sendKeys(text);
    }

}
