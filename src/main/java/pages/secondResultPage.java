package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class secondResultPage {
    private WebDriver driver;
    private By searchResults = By.cssSelector("div.tF2Cxc");
    public secondResultPage(WebDriver driver){
        this.driver=driver;
    }




}
