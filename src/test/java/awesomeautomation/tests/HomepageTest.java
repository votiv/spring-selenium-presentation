package awesomeautomation.tests;

import awesomeautomation.modules.ListContainer;
import awesomeautomation.modules.Homepage;
import awesomeautomation.modules.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static awesomeautomation.conf.Constants.RED;

/**
 * Created by viskyo on 24/09/2015.
 */
public class HomepageTest extends BaseTest {

    /**
     * PageObjects from beans
     */
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

        // These two are basically equivalent
        assertTrue(homepage.isButtonDisplayed(), "The love isn't happening :(");
        assertTrue(homepage.lookAtHomePage().isButtonDisplayed(), "The button isn't displayed!");
    }

    @Test(description = "The title gets it!")
    public void testTitle() {

        // These two are equivalent
        assertEquals(title.isTitleRed(), RED, "The title isn't red!");
        assertTrue(title.isTheTitleRed(), "The title isn't red!");
    }
}
