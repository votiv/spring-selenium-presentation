package awesomeautomation.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.BasePageObject;
import tools.BrowserManager;

/**
 * Created by viskyo on 25/09/2015.
 */
public class Title extends BasePageObject {

    @FindBy(id = "title")
    private WebElement titleText;

    public Title(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public Title(BrowserManager manager) {
        super(manager);
    }

    public boolean isTitleRed () {

        return titleText.getAttribute("style").equals("color: red;");
    }
}
