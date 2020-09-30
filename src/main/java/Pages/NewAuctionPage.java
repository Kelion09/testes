package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAuctionPage {

    private WebDriver driver;

    public NewAuctionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addAuction(String name, double value, String user){
        WebElement itemName = driver.findElement(By.name("leilao.nome"));
        WebElement itemPrice = driver.findElement(By.name("leilao.valorInicial"));
        Select objSelect = new Select(driver.findElement(By.name("leilao.usuario.id")));

        itemName.sendKeys(name);
        itemPrice.sendKeys(""+value);
        objSelect.selectByVisibleText(user);

        WebElement btnSalvar = driver.findElement(By.xpath("//*[text()='Salvar!']"));
        btnSalvar.click();
    }
}
