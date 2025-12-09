package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxPage {

    private WebDriver driver;
    private By checkingField = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[1]/label/input");
    private By resultText = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[1]/p");

    public CheckboxPage(WebDriver driver){
        this.driver = driver;
    }
    public void checkingBox(){
      driver.findElement(checkingField).click();
    }
    public String getResult(){
        return driver.findElement(resultText).getText();
    }

    //Disabled checkboxes
    private By disabledCheckboxes = By.cssSelector(".mt-40 div input[type=checkbox]");
    public void checkDisabledCheckboxes(){
        List<WebElement> elements = driver.findElements(disabledCheckboxes);
        int disabledCount =0;
        int EnabledCount =0;
        for(WebElement element : elements){
            if(element.isEnabled()) {
                System.out.println("This element is enables");
                EnabledCount++;
            }
            else {
                System.out.println("This element is disable");
                disabledCount++;
            }
        }
        System.out.println("the "+disabledCount +"are disabled and "+EnabledCount +" are enabled out of "+elements.size());
    }
    //Multiple checkboxes
    private By multipleCheckboxes = By.cssSelector(".flex.gap-30.flex-wrap input[type=checkbox]");
    private By checkAndUncheckBtn = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[3]/button");

    public void ClickButtonToUnCheckORToCheck(){
       driver.findElement(checkAndUncheckBtn).click();
       checkAllBoxes();
    }
    public void checkAllBoxes(){
        List<WebElement> checkboxes = driver.findElements(multipleCheckboxes);
        for(WebElement checkbox : checkboxes){
            checkbox.click();
        }
    }
}
