package awesomeautomation.tests;

import awesomeautomation.conf.EnvironmentConfiguration;
import awesomeautomation.conf.HomepageConfiguration;
import awesomeautomation.modules.Homepage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tools.BrowserManager;

/**
 * Created by viskyo on 24/09/2015.
 */
@ContextConfiguration(locations = {"classpath:conf/application-context.xml"})
public class BaseTest {
    private static Logger LOG = LoggerFactory.getLogger(BaseTest.class);

    protected BrowserManager browserManager;

    @Autowired
    HomepageConfiguration homepageConfiguration;

    @Autowired
    Homepage homepage;

    @BeforeClass
    public void setUp() {

        homepage.goToUrl(homepageConfiguration.getLovePage());
    }

    @AfterClass
    public void tearDown() {

    }
}
