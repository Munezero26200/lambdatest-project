package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileDownloadPage {

    private WebDriver driver;
    private By textArea = By.id("textbox");
    private By generateButton = By.id("create");
    private By downloadTxt =By.id("link-to-download");


    public FileDownloadPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterTextIntoTextArea(String text){
        driver.findElement(textArea).sendKeys(text);
        clickGenerateButton();
        clickDownloadTextLink();
    }
    public void clickGenerateButton(){
        driver.findElement(generateButton).click();
    }
    public void clickDownloadTextLink(){
        driver.findElement(downloadTxt).click();

    }
}
