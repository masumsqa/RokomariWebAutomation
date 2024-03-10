package pageses;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.io.ByteArrayInputStream;
import java.util.List;

import static uitilities.DriverSetup.getBrowser;

public class BasePage {
    WebDriver browser;

    public WebElement getElement(By locator) {
        return getBrowser().findElement(locator);
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public void loadWebPage(String url) {
        getBrowser().get(url);
    }

    public String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public void hoverOnElement(By locator) {
        Actions actions = new Actions(getBrowser());
        actions.clickAndHold(getElement(locator)).build().perform();
    }


    public void takeScreenShot(String name) {
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) getBrowser()).getScreenshotAs(OutputType.BYTES)));
    }

    public void selectDropdown(By locator, int number) {
        WebElement dropdown = getBrowser().findElement(locator);
        Select select = new Select(dropdown);
        dropdown.click();
        select.selectByIndex(number);
        System.out.println(select.getFirstSelectedOption().getText());
    }

    public void selectBookFromPage2(String name) throws InterruptedException {
        String locator = null;
        List<WebElement> listOfBook = getBrowser().findElements(By.xpath(locator));
        System.out.println(listOfBook.size());

        for (int i = 1; i <= listOfBook.size(); i++) {
            WebElement nameLocator = getBrowser().findElement(By.xpath(locator));
            System.out.println(nameLocator.getText());
            if (nameLocator.getText().equalsIgnoreCase(name)) {
                nameLocator.click();
            }
        }
    }
}




