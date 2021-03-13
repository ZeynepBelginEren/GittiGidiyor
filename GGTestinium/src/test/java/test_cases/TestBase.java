package test_cases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
public class TestBase {
    public static WebDriver driver = null;

    @Before
    public void initialize() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\ddriver\\chromedriver.exe");
        driver = new ChromeDriver();

        // To maximize browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(
                10, TimeUnit.SECONDS);


        driver.get("https://www.gittigidiyor.com/");
    }

    @After
    // Test cleanup
    public void TeardownTest() {
        TestBase.driver.quit();
    }
}
