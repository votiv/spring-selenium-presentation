package awesomeautomation.tests;

import awesomeautomation.conf.HomepageConfiguration;
import awesomeautomation.modules.Title;
import awesomeautomation.modules.Homepage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * Created by viskyo on 24/09/2015.
 */
@ContextConfiguration(locations = {"classpath:conf/application-context.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {
    private static Logger LOG = LoggerFactory.getLogger(BaseTest.class);

    @Autowired
    @Qualifier("homepageConfiguration")
    HomepageConfiguration homepageConfiguration;
}
