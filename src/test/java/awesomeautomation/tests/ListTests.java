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

        // Look for a WebElement based on it's contained text in the scope of the list container (simple use of SearchContext).
        list = listContainer.getListItem("2");
        Assert.assertEquals(list.getText(), "2", "Wrong!");

        // Instantiate only one list from the scope of list container
        list = listContainer.getContentOfSpecificList("list1"); // note to self: Da, e hardcodat. Tre' implementat @Factory

        // Just a method to get something specific from the previously instantiated element.
        Assert.assertEquals(list.getNthListItem(2), "2", "Wrong!");
    }

    @Test(description = "List2 test.")
    public void testList2() {

        // Same stuff as in previous test.
        list = listContainer.getListItem("one");
        Assert.assertEquals(list.getText(), "one", "Wrong!");
        list = listContainer.getContentOfSpecificList("list2");
        Assert.assertEquals(list.getNthListItem(2), "two", "Wrong!");
    }
}
