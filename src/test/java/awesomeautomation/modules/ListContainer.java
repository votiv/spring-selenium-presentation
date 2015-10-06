package awesomeautomation.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.BasePageObject;
import tools.BrowserManager;

import java.util.List;

/**
 * Created by viskyo on 30/09/2015.
 */
public class ListContainer extends BasePageObject {

    @FindBy(css = ".list-container")
    private WebElement listContainer;

    public ListContainer(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public ListContainer(BrowserManager manager) {
        super(manager);
    }

    public AwesomeLists getContentOfSpecificList(String listTitle) {

        //Instantiate a locator that finds the content section of a list based on the lists class.
        By locator = By.cssSelector("." + listTitle);

        return new AwesomeLists(getDriver(), getWait(), listContainer.findElement(locator));
    }

    public AwesomeLists getListItem(String itemText) {

        // Instantiate a locator that finds a list item based on its text.
        By locator = By.xpath("//*[.='" + itemText + "']");

        return new AwesomeLists(getDriver(), getWait(), listContainer.findElement(locator));
    }
}
