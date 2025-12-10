package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {

    private WebDriver driver;
    private By uploadField = By.id("file");
    private By resultText = By.xpath("//*[@id=\"error\"]");

    public UploadFilePage(WebDriver driver){
        this.driver = driver;
    }
    public void uploadObject(String absolutePath){
         driver.findElement(uploadField).sendKeys(absolutePath);
    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }



}
