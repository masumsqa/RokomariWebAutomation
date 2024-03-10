package pageses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static uitilities.DriverSetup.getBrowser;

public class BookPage extends BasePage{

    JavascriptExecutor js;
    WebElement browser;

    public String bookPage1Url = "https://www.rokomari.com/book";

    public String logo = "/static/200/images/rokomari_logo.png";

    public By lakhok = By.xpath("//a[@id='js--authors']");

    public  By humainAhmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");

    public By samakalinUpannas = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");

    public  By rochonaSankolon = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");

    public By nextButton = By.xpath("//div[@class=\"pagination\"]/a[4]");

    public  By shopByCategory = By.xpath("//div[@id=\"js--categoryIds\"]");

    public By selectByNumber1 = By.xpath("//div[@id=\"js--categoryIds\"]/div[1]");

    public By selectByNumber3 = By.xpath("//div[@id=\"js--categoryIds\"]/div[3]");



}
