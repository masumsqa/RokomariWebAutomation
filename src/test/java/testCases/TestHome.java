package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageses.HomePage;
import uitilities.DriverSetup;

public class TestHome extends DriverSetup {

    HomePage homepage = new HomePage();

    @Test
    public void testOffers() throws InterruptedException {
        getBrowser().get(homepage.homePageUrl);
        Assert.assertEquals(getBrowser().getCurrentUrl(), homepage.homePageUrl);


    }
}
