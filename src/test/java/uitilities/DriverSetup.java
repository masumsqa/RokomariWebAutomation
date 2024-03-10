package uitilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class DriverSetup {

    public WebDriver browser;

    public static String browserName = System.getProperty("browswe","chrome");
    private  static final ThreadLocal <WebDriver> Local_BROWSE = new ThreadLocal<>() ;

    public static WebDriver getBrowser() {
        return Local_BROWSE.get();
    }

    public static void setBrowser(WebDriver browser) {
        DriverSetup.Local_BROWSE.set(browser);
    }



    public WebDriver getBrowser(String browserName){
        if(browserName.equalsIgnoreCase("Chrome")){
            ChromeOptions options = new ChromeOptions();
            options.setBinary("D:\\Automation\\Driver\\Chrome Driver for testing\\chrome-win64\\chrome.exe");
            options.addArguments("--user-data-dir=C:\\Users\\progr\\AppData\\Local\\Google\\Chrome for Testing\\User Data");
            return new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("Edge")) {
            return new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            return new FirefoxDriver();
        }
        else{
            throw new RuntimeException("Browser are not available"+browserName);
        }
    }

    // @BeforeSuite
    //@BeforeTest
     @BeforeClass
    public void openABrowser(){

        WebDriver browser = getBrowser(browserName);
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        setBrowser(browser);
    }


    //@AfterSuite
   // @AfterTest
     @AfterClass
    public void quiteABrowser(){

        getBrowser().close();
    }


}
