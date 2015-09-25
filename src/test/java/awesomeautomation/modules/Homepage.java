package awesomeautomation.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import tools.BasePageObject;
import tools.BrowserManager;

/**
 * Created by viskyo on 24/09/2015.
 */
public class Homepage extends BasePageObject {

    @FindBy(css = ".love-text")
    private WebElement loveText;

    public Homepage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public Homepage(BrowserManager manager) {
        super(manager);
    }

    public WebElement getLoveText() {
        return loveText;
    }

    public String readMessage() {
        return loveText.getText();
    }
}
