package pageses;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String homePageUrl = "https://www.rokomari.com/book";

    public By closeButton = By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']");

    public By signButton = By.xpath("//a[normalize-space()='Sign in']");

}
