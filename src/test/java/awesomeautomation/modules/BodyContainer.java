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
public class BodyContainer extends BasePageObject {

    @FindBy(css = ".first-paragraph")
    private WebElement firstParagraph;

    public BodyContainer(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public BodyContainer(BrowserManager manager) {
        super(manager);
    }

    public BodyContainer(SearchContext context) {
        super(context);
    }

    public WebElement firstParagraphIsOnFire() {

        return findLinkIn(firstParagraph);
    }

    private WebElement findLinkIn(SearchContext context) {

        return context.findElement(By.tagName("a"));
    }

    public WebElement getFirstParagraph() {

        return firstParagraph;
    }

    //Finds all the elements whose text is the specified string (text),
    //and that are contained in the passed webdriver, or webelement (searchCon)
    public List<WebElement> findElementsUsingText(SearchContext searchCon, String text){

        //Instantiate a locator that finds an element based on its contained text.
        By locator = By.xpath("//*[.='" + text + "']");

        //Return a list of all elements with the specified text contained in the searchContext
        return searchCon.findElements(locator);
    }
}
