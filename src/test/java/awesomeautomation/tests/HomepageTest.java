package awesomeautomation.tests;

import awesomeautomation.conf.EnvironmentConfiguration;
import awesomeautomation.conf.HomepageConfiguration;
import awesomeautomation.modules.BodyContainer;
import awesomeautomation.modules.Homepage;
import awesomeautomation.modules.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by viskyo on 24/09/2015.
 */
public class HomepageTest extends BaseTest {

    @Autowired
    Homepage homepage;

    @Autowired
    Title title;

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

        BodyContainer bodyContainer = homepage.getBodyContainer();

        Assert.assertTrue(bodyContainer.firstParagraphIsOnFire().isDisplayed(), "The title isn't red!");
    }
}
