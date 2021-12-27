package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    private WebDriver driver;
    private By searchBar = By.name("q");
    protected firstResultPage firstResultPage;


    public homePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickSearchBar(String searchWord) {
        driver.findElement(searchBar).sendKeys(searchWord);
    }

    public firstResultPage pressSearchButton() {
        driver.findElement(searchBar).submit();
        firstResultPage = new firstResultPage(driver);
        return new firstResultPage(driver);

    }



}






