package awesomeautomation.tests;

import awesomeautomation.conf.EnvironmentConfiguration;
import awesomeautomation.conf.HomepageConfiguration;
import awesomeautomation.modules.Homepage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by viskyo on 24/09/2015.
 */
public class HomepageTest extends BaseTest {

    @BeforeClass
    public void setUp() {

        homepage.goToUrl(homepageConfiguration.getLovePage());
    }

    @Test(description = "Testing the shit out of this homepage!")
    public void testHomepage () {

        Assert.assertEquals(homepage.readMessage(), "Spring + Selenium = Love", "The love isn't happening :(");
    }
}
