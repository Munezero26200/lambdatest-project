package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class contextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");

    public contextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnBox(){

        WebElement clickableSpace = driver.findElement(box);
        Actions actions = new Actions(driver);
        actions.contextClick(clickableSpace).perform();
    }
    public String handlePopUpMessage(){
      Alert switchToAlert  = driver.switchTo().alert();
      String text = switchToAlert.getText();
      switchToAlert.accept();
      return text;
    }
}
