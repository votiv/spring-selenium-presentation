package awesomeautomation.tests;

import awesomeautomation.modules.ListContainer;
import awesomeautomation.modules.Homepage;
import awesomeautomation.modules.Title;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by viskyo on 24/09/2015.
 */
public class HomepageTest extends BaseTest {

    @Autowired
    Homepage homepage;

    @Autowired
    Title title;

    @Autowired
    ListContainer listContainer;

    @BeforeClass
    public void setUp() {

        homepage.goToUrl(homepageConfiguration.getLovePage());
    }

    @Test(description = "Testing the shit out of this homepage!")
    public void testHomepage () {

        Assert.assertTrue(homepage.isButtonDisplayed(), "The love isn't happening :(");
    }

    @Test(description = "The title gets it!")
    public void testTitle() {

        Assert.assertTrue(title.isTitleRed(), "The title isn't red!");
    }

    @Test(description = "Is there fire?")
    public void isThereFire() {

//        Assert.assertTrue(listContainer.firstParagraphIsOnFire().isDisplayed(), "The title isn't red!");
    }

    @Test(description = "SearchContext test")
    public void testSC() {

//        List<WebElement> elementList = listContainer.findElementsUsingText(listContainer.getFirstParagraph(), "fire");
//        Assert.assertEquals(elementList.get(0).getText(), "fire", "Is not on fire!");
    }
}
