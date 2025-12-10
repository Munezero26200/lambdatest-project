package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverDemoPage {

    private WebDriver driver;
    private By leftButton = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/div/div/div/div/div[1]/div[1]");
    private By rightButton = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/div/div/div/div/div[1]/div[2]");

    public HoverDemoPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean HoverOntoButtonAndCheckColorLeftButton(){
        WebElement button = driver.findElement(leftButton);
        String colorBeforeHover = button.getCssValue("background-color");

        Actions hoverAction = new Actions(driver);
        hoverAction.moveToElement(button).perform();

        String colorAfterHover = button.getCssValue("background-color");
        return !colorBeforeHover.equals(colorAfterHover);
    }
    public boolean HoverOntoButtonAndCheckColorRightButton(){
        WebElement button = driver.findElement(rightButton);
        String colorBeforeHover = button.getCssValue("background-color");

        Actions hoverAction = new Actions(driver);
        hoverAction.moveToElement(button).perform();

        String colorAfterHover = button.getCssValue("background-color");
        return !colorBeforeHover.equals(colorAfterHover);
    }

}
