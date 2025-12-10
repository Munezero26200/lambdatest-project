package Alerts;

import Tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertsAcceptTests extends BaseTests {
    @Test
    public void testAcceptAlerts(){
        var alertsPage = homepage.clickJavaScriptAlert();
        alertsPage.clickJavaScriptAlertsBtn();
        String resultText = alertsPage.getText();
        alertsPage.AcceptAlert();
        assertEquals(resultText, "I am an alert box!","Fails");
    }

    @Test
    public void testGetConfirmText(){
        var alertsPage = homepage.clickJavaScriptAlert();
        alertsPage.clickJavaScriptConfirmBtn();
        String text = alertsPage.getText();
        assertEquals(text, "Press a button!", "fail");
    }

    @Test
    public void testconfirmAlert(){
        var alertPage = homepage.clickJavaScriptAlert();
        alertPage.clickJavaScriptConfirmBtn();
        //alertPage.AcceptAlert();
        alertPage.cancelAlert();
        String text = alertPage.resultText();
        assertEquals(text,"You pressed Cancel!","fail");
    }

}
