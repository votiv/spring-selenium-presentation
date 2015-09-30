package notawesome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by viskyo on 25/09/2015.
 */
public class NotAwesome {

    private WebDriver driver;
    private WebDriverWait wait;

    public void initDriver() {

        this.driver = new FirefoxDriver();

        driver.get("http://localhost:8070");
        driver.manage().window().maximize();
    }

    public void closeDriver() {

        driver.quit();
    }

    @BeforeClass
    public void setUp() {

        initDriver();
        iniPageObject();
    }

    private void iniPageObject() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "title")
    WebElement title;

    @Test
    public void testThisPage() {

        Assert.assertEquals(title.getText(), "Spring + Selenium = Love", "The title is not awesome!");
    }


    @AfterClass
    public void tearDown() {

        closeDriver();
    }
}
