package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuctionPage {

    private WebDriver driver;

    public AuctionPage(WebDriver driver) {
        this.driver = driver;
    }

    public NewAuctionPage newAuctionPage(){
        driver.findElement(By.linkText("Novo Leilão")).click();
        return new NewAuctionPage(driver);
    }
}
