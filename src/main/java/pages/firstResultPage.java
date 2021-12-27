package pages;

import org.openqa.selenium.*;

public class firstResultPage {
    private WebDriver driver;
    private By searchPages = By.id("pnnext");
    protected secondResultPage secondResultPage;

    public firstResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToSearchPages() {

        WebElement searchPagesElement = driver.findElement(searchPages);
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        ((JavascriptExecutor) driver).executeScript(script, searchPagesElement);
    }
    public secondResultPage clickNextPage(){
        driver.findElement(searchPages).click();
        secondResultPage = new secondResultPage(driver);
        return new secondResultPage(driver);

    }



}
