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
    public UploadFilePage clickUploadFileDemo(){
        clickLink("Upload File Demo");
        return new UploadFilePage(driver);
    }
    public CheckboxPage clickCheckboxDemo(){
        clickLink("Checkbox Demo");
        return new CheckboxPage(driver);
    }
    public contextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new contextMenuPage(driver);
    }
    public IframeDemoPage clickIframeDemo(){
        clickLink("iFrame Demo");
        return new IframeDemoPage(driver);
    }
    public HoverDemoPage clickHoverDemo(){
        clickLink("Hover Demo");
        return new HoverDemoPage(driver);
    }

}
