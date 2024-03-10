package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageses.HomePage;
import pageses.LoginPage;
import uitilities.DriverSetup;

public class TestLogin extends DriverSetup {

    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();

    @Test
    public void testLogin() throws InterruptedException {

        getBrowser().get(homepage.homePageUrl);
        Thread.sleep(5000);
        Assert.assertTrue(loginpage.getElement(loginpage.title).isDisplayed());
    }
}
