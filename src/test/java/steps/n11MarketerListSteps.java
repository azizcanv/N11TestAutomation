package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.MarketersPage;
import pages.N11Page;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class n11MarketerListSteps {

    N11Page N11Page = new N11Page();
    MarketersPage MarketersPage = new MarketersPage();

    private WebDriver driver;

    @Given("N11 anasayfası açılır")
    public void n11AnasayfasiAcilir() {
        driver = Driver.getDriver();
        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("Mağazalar tıklanır")
    public void magazalarTiklanir() {
        N11Page.clickOnayButton();
        N11Page.clickMagazalarButton();
    }

    @And("A ile başlayan mağazalar listelenir")
    public void aIleBaslayanMagazalarListelenir() throws InterruptedException{
        N11Page.clickAMarkaButton();
        Thread.sleep(5000);
    }

    @Then("Listelenen mağazalar txte yazdırılır")
    public void listelenenMagazalarTxteYazdirilir() throws InterruptedException {
        MarketersPage.marketersWriter();
        Thread.sleep(5000);
        driver.quit();
    }
}