package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage extends AbstractClass {

    WebDriver driver;

    public CartPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='myBasket basket-icon custom-icon']")
    private WebElement cartButton;

    public void clickCartButton() {
        clickFunction(cartButton);
    }

    @FindBy(xpath = "//span[@class='btn btnBlack']")
    private WebElement contractButton;

    public void clickContractButton() {
        clickFunction(contractButton);
    }

    //Sepet Urun Konrtol
    public void urunOlayi() {
        WebElement urun1 = driver.findElement(By.xpath("(//td[@class='prodPrice'])[1]"));
        String u1 = urun1.getText().replaceAll("\\D+", "");
        int ru1 = Integer.parseInt(u1);
        System.out.printf("%d%n", ru1);
        WebElement urun2 = driver.findElement(By.xpath("(//td[@class='prodPrice'])[2]"));
        String u2 = urun2.getText().replaceAll("\\D+", "");
        int ru2 = Integer.parseInt(u2);
        System.out.printf("%d%n", ru2);

        if (ru1 > ru2) {
            System.out.println("heloooo");
            driver.findElement(By.xpath("(//span[@class='spinnerUp spinnerArrow'])[2]")).click();
        } else {
            System.out.println("else çalışıyorrr");
            driver.findElement(By.xpath("(//span[@class='spinnerUp spinnerArrow'])[1]")).click();
        }
    }

    //Odeme Kismi
    @FindBy(xpath = "//span[text()='Satın Al']")
    private WebElement buyButton;

    public void clickBuyButton() {
        clickFunction(buyButton);
    }

    @FindBy(xpath = "(//div[@class='inputField '])[1]")
    private WebElement uyeOlmadanDevam;

    public void scrollUyeOlmadanDevam() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uyeOlmadanDevam);
    }

    @FindBy(xpath = "//a[@title='Üye Olmadan Devam Et']")
    public WebElement uyeOlmadanDevamEtLinki;

    public void clickGuestBuyButton() {
        clickFunction(uyeOlmadanDevamEtLinki);
    }
}
