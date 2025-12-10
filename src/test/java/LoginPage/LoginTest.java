package LoginPage;

import Pages.DashboardPage;
import Tests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {
    @Test
    public void testLoginPage(){
       var entrancePage =  homepage.clickLoginPage();
       entrancePage.enterEmail("alinemunezero920@gmail.com");
       entrancePage.enterPassword("!bAZeLyHR&QU2r?");
       var goToDashboard = entrancePage.clickLoginBtn();


     assertTrue(goToDashboard.isDashboardVisible(), "Dashboard page is not open after clicking login button");
    }
}
