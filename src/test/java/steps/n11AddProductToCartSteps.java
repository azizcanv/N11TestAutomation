package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.ListPage;
import pages.N11Page;
import utilities.Driver;

public class n11AddProductToCartSteps {

    N11Page N11Page = new N11Page();
    ListPage ListPage = new ListPage();
    CartPage CartPage = new CartPage();


    @When("^Arama çubuğuna (.*) yazıp aratılır$")
    public void aramaCubugunaVeriGirilir(String urun) throws InterruptedException {
        N11Page.clickOnayButton();
        N11Page.clickCookiesButton();
        N11Page.typeSearchData(urun);
        N11Page.clickSearchButton();
        Thread.sleep(3000);
    }

    @And("Gelen sonuçlar yorum sayısına ve ücretsiz kargo olanlara göre sıralanır")
    public void gelenUrunlerListelenir() throws InterruptedException {
        ListPage.clickCargoButton();
        ListPage.clickListButton();
        ListPage.clickYorumButton();
    }

    @And("Gelen sonuçlardan ilk sayfadaki birinci ve son ürün sepete eklenir")
    public void urunlerSepeteEklenir() throws InterruptedException {
        ListPage.clickFirstProductButton();
        Thread.sleep(2000);
        ListPage.clickAddProductButton();
        Thread.sleep(3000);
        ListPage.goBack();
        Thread.sleep(3000);
        ListPage.clickSecondProductButton();
        Thread.sleep(2000);
        ListPage.clickAddProductButton();
        Thread.sleep(3000);
    }

    @And("Sepete gidilerek ürünlerden en ucuzunun adedi 2 yapılır")
    public void sepetGuncellenir() throws InterruptedException {
        CartPage.clickCartButton();
        CartPage.clickContractButton();
        CartPage.urunOlayi();
        Thread.sleep(5000);
    }

    @Then("Misafir kullanıcı olarak ödeme adımına ilerlenir")
    public void odemeAdiminaIlerlenir() throws InterruptedException {
        CartPage.clickBuyButton();
        Thread.sleep(3000);
        Driver.getDriver().navigate().refresh();
        Thread.sleep(5000);
        CartPage.scrollUyeOlmadanDevam();
        Thread.sleep(5000);
        CartPage.clickGuestBuyButton();
    }
}