package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.firstResultPage;
import pages.homePage;

public class baseTests {
    private WebDriver driver;
    protected homePage homePage;
    protected firstResultPage firstResultPage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        homePage = new homePage(driver);
        firstResultPage = new firstResultPage(driver);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }

    @AfterClass
    public void shutDown() {
        driver.close();
    }
}




