package awesomeautomation.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;
import tools.BasePageObject;
import tools.BrowserManager;

/**
 * Created by viskyo on 25/09/2015.
 */
public class Header extends BasePageObject {

    @FindBy(id = "title")
    private WebElement headerText;

    public Header(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public Header(BrowserManager manager) {
        super(manager);
    }

    public boolean isTitleRed () {

        return headerText.getAttribute("style").equals("color: red;");
    }
}
