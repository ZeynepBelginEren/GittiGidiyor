package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchPage {
    WebDriver driver ;
    SearchPage(WebDriver driver)
    {
        this.driver = driver;
    }


    //WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement searchBarClick = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]"));


    WebElement search = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input"));
    WebElement searchTextBox;
    WebElement searchClick = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[2]/button"));
    WebElement two=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[5]ul/li[2]/a"));

    public void Search() {
        search.click();
    }
    public void SearchBarClick() {
        searchBarClick.click();
    }
    public void setSearchTextBox(String strSearch) {
        searchTextBox.sendKeys(strSearch);
    }
    public void SearchClick() {
        searchClick.click();

    }
    public void twoClick() {
        two.click();
    }
}














