package awesomeautomation.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.BasePageObject;
import tools.BrowserManager;

/**
 * Created by viskyo on 30/09/2015.
 */
public class BodyContainer extends BasePageObject {

    @FindBy(css = ".first-paragrapg")
    private WebElement firstParagraph;

    public BodyContainer(SearchContext context) {
        super(context);
    }

    public WebElement firstParagraphIsOnFire() {

        WebElement webElement = findLinkIn(firstParagraph);

        return webElement;
    }

    private WebElement findLinkIn(SearchContext context) {

        WebElement webElement = context.findElement(By.tagName("a"));

        return webElement;
    }
}
