package awesomeautomation.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.BasePageObject;
import tools.BrowserManager;

import java.util.List;

/**
 * Created by viskyo on 06/10/2015.
 */
public class AwesomeLists extends BasePageObject {

    private List<WebElement> specificList = getSearchContext().findElements(By.cssSelector("ul li"));
    private SearchContext li = getSearchContext();

    public AwesomeLists(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public AwesomeLists(BrowserManager manager) {
        super(manager);
    }

    public AwesomeLists(WebDriver driver, WebDriverWait wait, SearchContext context) {
        super(driver, wait, context);
    }

    public String getNthListItem(int nth) {

        return specificList.get(nth - 1).getText();
    }

    public String getText() {

        return ((WebElement) li).getText();
    }
}
