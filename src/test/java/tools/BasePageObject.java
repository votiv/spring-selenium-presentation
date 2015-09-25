package tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by viskyo on 24/09/2015.
 */
public class BasePageObject {

    private static final Logger LOG = LoggerFactory.getLogger(BasePageObject.class);
    public long pageLoadTimeout = 30;
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePageObject(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Autowired
    public BasePageObject(BrowserManager manager) {
        this(manager.getDriver(), manager.getWait());
    }

    public void initPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }

    /**
     * Navigate to a specific URL
     *
     * @param url - the url to initialize the driver to
     */
    public void goToUrl(String url, boolean waitForComplete) {
        int maxRetryCount = 3;
        while (true) {
            try {
                driver.get(url);
                break;
            } catch (TimeoutException e) {
                LOG.warn("Retry navigation", e);
                if (--maxRetryCount <= 0) throw e;
            }
        }
        if (waitForComplete) {
            waitForPageLoad();
        }
    }

    public void goToUrl(String url) {
        goToUrl(url, true);
    }

    /**
     * wait for document.readyState == "complete"
     */
    public void waitForPageLoad() {
        wait.until(new ExpectedConditionWaitForLoad());
    }

    /**
     * Class for tools of explicit wait for modules to load.
     * Selenium is waiting only for document.readyState == "interactive" so this should be safer.
     */
    public static class ExpectedConditionWaitForLoad implements ExpectedCondition<Boolean> {

        public Boolean apply( WebDriver webDriver) {
            return ((JavascriptExecutor) webDriver).executeScript("return document.readyState;").equals("complete");
        }
    }
}
