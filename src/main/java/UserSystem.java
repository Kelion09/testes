import Pages.HomePage;
import Pages.NewUserPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class UserSystem {

    private ChromeDriver driver;
    private HomePage user;
    private NewUserPage form;


    @Before
    public void start(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.user = new HomePage(driver);

        user.startInHomePage();

        user.userPage().newUserPage().addUser("Larissa","larissa@email.com");
    }

    @Test
    public void userRegisterFail() throws InterruptedException {
        form = user.userPage().newUserPage();

        form.addUser("", "");

        Thread.sleep(3000);
        assertTrue(form.needName());
        assertTrue(form.needEmail());
    }

    @Test
    public void userRegisterSuccess(){
        user.userPage().newUserPage().addUser("Paulo Henrique","paulohenrique@email.com");

        assertTrue(user.userPage().existUsers("Paulo Henrique","paulohenrique@email.com"));
    }

    @Test
    public void createAuction(){

        user.userPage().auctionPage().newAuctionPage().addAuction("Computador", 1000.00, "Larissa");
    }
}
