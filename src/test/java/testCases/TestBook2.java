package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageses.BookPage;
import pageses.BookPage2;
import pageses.HomePage;
import pageses.LoginPage;
import uitilities.DriverSetup;

public class TestBook2 extends DriverSetup {

    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();
    BookPage bookpage = new BookPage();

    BookPage2 bookpage2 = new BookPage2();

    @Test
    public void testBookpage2() throws InterruptedException {

        getBrowser().get(homepage.homePageUrl);
        Thread.sleep(1000);
        bookpage.hoverOnElement(bookpage.lakhok);
        bookpage.hoverOnElement(bookpage.humainAhmed);
        bookpage.clickOnElement(bookpage.humainAhmed);
        JavascriptExecutor js = (JavascriptExecutor)getBrowser();
        js.executeScript("window.scrollTo(0,600);");
        Thread.sleep(1000);
        bookpage.clickOnElement(bookpage.selectByNumber1);
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,600);");
        Thread.sleep(1000);
        bookpage.clickOnElement(bookpage.selectByNumber3);
        Thread.sleep(1000);
        WebElement NextPage = getBrowser().findElement(By.xpath("//div[@class=\"pagination\"]/a[1]"));
        js.executeScript("arguments[0].click();",NextPage);
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,800);");
        Thread.sleep(1000);
        bookpage2.selectBookFromPage2("জল জোছনা হুমায়ূন আহমেদ");
        Thread.sleep(2000);

    }
}
