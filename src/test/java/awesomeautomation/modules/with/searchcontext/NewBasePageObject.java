package awesomeautomation.modules.with.searchcontext;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.BasePageObject;
import tools.BrowserManager;

/**
 * Created by viskyo on 29/09/2015.
 */
public class NewBasePageObject extends BasePageObject {

    public NewBasePageObject(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public NewBasePageObject(BrowserManager manager) {
        super(manager);
    }

    private WebDriver driver = getDriver();

    public void init() {

        driver = new FirefoxDriver();
        driver.get("www.google.com");
        driver.manage().window().maximize();
    }
}
