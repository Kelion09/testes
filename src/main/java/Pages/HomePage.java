package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void startInHomePage(){
        driver.get("http://localhost:8080");
    }

    public UsersPage userPage(){
        driver.findElement(By.linkText("Usuários")).click();
        return new UsersPage(driver);
    }
}
