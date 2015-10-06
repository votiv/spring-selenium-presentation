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

/**
 * Created by viskyo on 06/10/2015.
 */
public class List extends BasePageObject {

    private java.util.List<WebElement> li = getSearchContext().findElements(By.cssSelector("ul li"));

    public List(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public List(BrowserManager manager) {
        super(manager);
    }

    public List(WebDriver driver, WebDriverWait wait, SearchContext context) {
        super(driver, wait, context);
    }

    public String getNthListItem(int nth) {

        return li.get(nth - 1).getText();
    }
}
