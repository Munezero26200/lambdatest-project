package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframeDemoPage {

    private WebDriver driver;
    private By frameField = By.id("iFrame1");
    private By inputField = By.cssSelector("div.rsw-editor .rsw-ce");

    public IframeDemoPage(WebDriver driver){
        this.driver = driver;
    }

    public void switchToFrame(){
        driver.switchTo().frame(driver.findElement(frameField));
    }
    public void clearFrame(){
        driver.findElement(inputField).clear();
    }
    public String setContentInFrame(String text){
        switchToFrame();
        clearFrame();
        driver.findElement(inputField).sendKeys(text);

        String resultTxt = driver.findElement(inputField).getText();
        driver.switchTo().defaultContent();
        return resultTxt;
    }

}
