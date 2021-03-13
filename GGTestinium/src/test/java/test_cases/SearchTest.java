package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.junit.Test;
import pages.SearchPage;


public class SearchTest extends TestBase {


    @Test
    public void search() throws InterruptedException {

        SearchPage searchPage =
                PageFactory.initElements(driver,
                        SearchPage.class);

        searchPage.Search();
        searchPage.SearchBarClick();
        searchPage.setSearchTextBox("bilgisayar");
        searchPage.SearchClick();
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight");
        searchPage.twoClick();
    }

}
