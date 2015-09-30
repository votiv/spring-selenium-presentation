package awesomeautomation.modules.with.searchcontext;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.BrowserManager;

/**
 * Created by viskyo on 29/09/2015.
 */
public class HomePageModule extends NewBasePageObject {

    public HomePageModule(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public HomePageModule(BrowserManager manager) {
        super(manager);
    }
}
