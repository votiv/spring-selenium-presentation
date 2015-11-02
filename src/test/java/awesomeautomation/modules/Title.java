package awesomeautomation.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.BasePageObject;
import tools.BrowserManager;

import static awesomeautomation.conf.Constants.RED;

/**
 * Created by viskyo on 25/09/2015.
 */
public class Title extends BasePageObject {

    /**
     * WebElements
     */
    @FindBy(id = "title")
    private WebElement titleText;

    /**
     * Constructors
     * @param driver
     * @param wait
     */
    public Title(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public Title(BrowserManager manager) {
        super(manager);
    }

    /**
     * Services
     */
    public String isTitleRed () {

        return titleText.getCssValue("color");
    }

    public boolean isTheTitleRed() {

        return titleText.getCssValue("color").equals(RED);
    }
}
