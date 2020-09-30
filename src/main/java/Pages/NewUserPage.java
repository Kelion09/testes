package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUserPage {

    private WebDriver driver;

    public NewUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean needName(){
        return driver.getPageSource().contains("Nome obrigatorio!");
    }

    public boolean needEmail(){
        return driver.getPageSource().contains("E-mail obrigatorio!");
    }

    public void addUser(String name, String email){
        WebElement userName = driver.findElement(By.name("usuario.nome"));
        WebElement userEmail = driver.findElement(By.name("usuario.email"));

        userName.sendKeys(name);
        userEmail.sendKeys(email);

        WebElement saveButton = driver.findElement(By.id("btnSalvar"));
        saveButton.click();
    }
}
