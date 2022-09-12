package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MovitaPage {

    public MovitaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class=\"standard-logo\"]")
    public WebElement movitaLogo;

    @FindBy(xpath = "//div[text()=\"Mobil Vasıta İzleme Takip Sistemi\"]")
    public WebElement mainTextTurkish;

    @FindBy(xpath = "//button[@id=\"dropdownMenuButton\"]")
    public WebElement dropDown;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[2]")
    public WebElement turkishOpiton;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[1]")
    public WebElement englishOption;

    @FindBy(xpath = "(//div[@class=\"tp-caption ltl tp-resizeme revo-slider-emphasis-text p-0 border-0 skrollable skrollable-between\"])[1]")
    public WebElement mainTextEnglish;







}
