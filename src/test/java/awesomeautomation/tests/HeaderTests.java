package awesomeautomation.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by viskyo on 25/09/2015.
 */
public class HeaderTests extends BaseTest {

    @BeforeClass
    public void setUp() {

        homepage.goToUrl(homepageConfiguration.getLovePage());
    }

    @Test(description = "Testing the shit out of this homepage!")
    public void testHomepage () {

        Assert.assertTrue(header.isTitleRed(), "The love isn't happening :(");
    }
}
