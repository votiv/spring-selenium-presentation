package awesomeautomation.tests;

import awesomeautomation.conf.HomepageConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * Created by viskyo on 24/09/2015.
 */
@ContextConfiguration(locations = {"classpath:conf/application-context.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    @Qualifier("homepageConfiguration")
    HomepageConfiguration homepageConfiguration;
}
