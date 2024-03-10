package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageses.*;
import uitilities.DriverSetup;

public class TestJolJochona extends DriverSetup {
    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();
    BookPage bookpage = new BookPage();

    BookPage2 bookpage2 = new BookPage2();

    BookJoljochona joljochona = new BookJoljochona();

    @Test
    public void testjoljochona() throws InterruptedException {
        getBrowser().get(homepage.homePageUrl);
        Thread.sleep(1000);
        bookpage.hoverOnElement(bookpage.lakhok);
        bookpage.hoverOnElement(bookpage.humainAhmed);
        bookpage.clickOnElement(bookpage.humainAhmed);
        JavascriptExecutor js = (JavascriptExecutor) getBrowser();
        js.executeScript("window.scrollTo(0,600);");
        Thread.sleep(1000);
        bookpage.clickOnElement(bookpage.selectByNumber1);
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,600);");
        Thread.sleep(1000);
        bookpage.clickOnElement(bookpage.selectByNumber3);
        Thread.sleep(1000);
        WebElement NextPage = getBrowser().findElement(By.xpath("//div[@class=\"pagination\"]/a[1]"));
        js.executeScript("arguments[0].click();", NextPage);
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,800);");
        Thread.sleep(1000);
        bookpage2.selectBookFromPage2("লীলাবতী");
        Thread.sleep(2000);

//        joljochona.clickOnElement(joljochona.addtochart);
//        Thread.sleep(2000);
//        joljochona.clickOnElement(joljochona.gotochart);
//        Thread.sleep(2000);
//        joljochona.clickOnElement(joljochona.deletbookorder);
//        Thread.sleep(2000);
//        joljochona.clickOnElement(joljochona.Haa);
//        Thread.sleep(3000);

    }
}
