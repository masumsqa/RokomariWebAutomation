package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageses.BookPage;
import pageses.HomePage;
import pageses.LoginPage;
import uitilities.DriverSetup;

public class TestBook extends DriverSetup {



    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();
    BookPage bookpage = new BookPage();

    @Test
    public void testBook() throws InterruptedException {
        getBrowser().get(homepage.homePageUrl);
        Thread.sleep(1000);
        bookpage.hoverOnElement(bookpage.lakhok);
        bookpage.hoverOnElement(bookpage.humainAhmed);
        bookpage.clickOnElement(bookpage.humainAhmed);
        JavascriptExecutor js = (JavascriptExecutor)getBrowser();
        js.executeScript("window.scrollTo(0,600);");
        Thread.sleep(2000);
        bookpage.clickOnElement(bookpage.selectByNumber1);
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,600);");
        Thread.sleep(1000);
        bookpage.clickOnElement(bookpage.selectByNumber3);
        Thread.sleep(2000);
        WebElement NextPage = getBrowser().findElement(By.xpath("//div[@class=\"pagination\"]/a[1]"));
        js.executeScript("arguments[0].click();",NextPage);
        Thread.sleep(3000);




    }
}
