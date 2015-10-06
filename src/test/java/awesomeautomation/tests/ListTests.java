package awesomeautomation.tests;

import awesomeautomation.conf.HomepageConfiguration;
import awesomeautomation.modules.AwesomeLists;
import awesomeautomation.modules.ListContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by viskyo on 06/10/2015.
 */
public class ListTests extends BaseTest {

    @Autowired
    HomepageConfiguration homepageConf;

    @Autowired
    ListContainer listContainer;

    AwesomeLists list;

    @BeforeClass
    public void setUp() {

        listContainer.goToUrl(homepageConf.getLovePage());
    }

    @Test(description = "List1 test.")
    public void testList1() {

        list = listContainer.getContentOfSpecificList("list1");
        Assert.assertEquals(list.getNthListItem(2), "2", "Wrong!");
    }

    @Test(description = "List2 test.")
    public void testList2() {

        list = listContainer.getContentOfSpecificList("list2");
        Assert.assertEquals(list.getNthListItem(2), "two", "Wrong!");
    }
}
