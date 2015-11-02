package awesomeautomation.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.BasePageObject;
import tools.BrowserManager;

/**
 * Created by viskyo on 24/09/2015.
 */
public class Homepage extends BasePageObject {

    /**
     * WebElements
     */
    @FindBy(css = ".button")
    private WebElement awesomeButton;

    @FindBy(css = ".body-container")
    private WebElement bodyContainer;

    /**
     * Constructors
     * @param driver
     * @param wait
     */
    public Homepage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public Homepage(BrowserManager manager) {
        super(manager);
    }

    /**
     * Services
     */
    public boolean isButtonDisplayed() {
        return awesomeButton.isDisplayed();
    }

    public Homepage lookAtHomePage() {
        return this;
    }
}
