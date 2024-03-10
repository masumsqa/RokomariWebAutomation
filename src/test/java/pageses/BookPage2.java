package pageses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static uitilities.DriverSetup.getBrowser;

public class BookPage2 extends BasePage {

    public String bookpage2url = "https://www.rokomari.com/book/author/1/humayun-ahmed?xyz=&categoryIds=677&categoryIds=1321&priceRange=0to45100&discountRange=0to30&page=2";

    public By humaunAhmedBooks = By.xpath("//div[@class=\"books-wrapper row\"]/div[3]");


    public void selectBookFromPage2(String name) throws InterruptedException {

        List<WebElement> listOfBook = getBrowser().findElements(By.xpath("//div[@class=\"books-wrapper row\"]/div"));
        System.out.println(listOfBook.size());

        for (int i = 1; i <= listOfBook.size(); i++) {
            boolean b = false;
            WebElement nameLocator = getBrowser().findElement(By.xpath("//div[@class='books-wrapper row']/div["+i+"]/div/a/div[2]/h4[@class='book-title']"));

            if (nameLocator.getText().equalsIgnoreCase(name)) {
                System.out.println(nameLocator.getText());
                WebElement open = By.xpath("//div[@class='books-wrapper row']/div["+i+"]/div/a");

                Thread.sleep(1000);
                open.click();
                Thread.sleep(10000);
                b = true;
            }else{
                System.out.println("Not Found");
            }
            if(b==true){
                break;
            }
        }
    }
}












