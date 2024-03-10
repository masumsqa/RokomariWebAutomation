package pageses;

import org.openqa.selenium.By;

public class BookJoljochona extends BasePage{

    public String joljochonaUrl = "https://www.rokomari.com/book/1264/jol-jochna";


    public By addtochart = By.xpath("//div[@class=\"books-wrapper__item\"][4]/div/a/div/div[3]/button");

    public By gotochart = By.xpath("//a[@class='btn btn-place-order ml-2']//span[contains(text(),'Go To Cart')]");

    public  By deletbookorder = By.xpath("//img[@alt='trash']");

    public  By Haa = By.xpath("//button[contains(text(),'হ্যাঁ')]");

    public By yourproducrisempty = By.xpath("//h2[normalize-space()='Your Cart is Empty!']");


}
