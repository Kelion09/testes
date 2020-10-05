package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersPage {

    private WebDriver driver;

    public UsersPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean existUsers(String name, String email){
        return driver.getPageSource().contains(name) && driver.getPageSource().contains(email);
    }

    public NewUserPage newUserPage(){
        driver.findElement(By.linkText("Novo Usuário")).click();
        return new NewUserPage(driver);
    }

    public AuctionPage auctionPage(){
        driver.findElement(By.xpath("//a[contains(@href, '/leiloes')]")).click();
//        driver.findElement(By.xpath("//*[text()='Leilões']")).click();
        return new AuctionPage(driver);
    }
}
