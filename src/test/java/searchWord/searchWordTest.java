package searchWord;

import base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class searchWordTest extends baseTests {
    @Test
    public void testSearchWord(){
        homePage.clickSearchBar("Vodafone");
        homePage.pressSearchButton();
    }
    @Test
    public void testScroll(){
        firstResultPage.scrollToSearchPages();
        firstResultPage.clickNextPage();
    }
}
