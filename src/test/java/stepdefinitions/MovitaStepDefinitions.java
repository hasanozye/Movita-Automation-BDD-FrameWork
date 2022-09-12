package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class MovitaStepDefinitions {

    MovitaPage movita = new MovitaPage();

    @Given("Go to {string} page")
    public void go_to_page(String string) {
        Driver.getDriver().get("https://movita.com.tr/");
        String movitaTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(movitaTitle.contains("movita"));
    }

    @When("Hover the Movita Logo with mouse")
    public void hover_the_movita_logo_with_mouse() {
        ReusableMethods.hover(movita.movitaLogo);
        ReusableMethods.waitForClickablility(movita.movitaLogo, 7);
    }

    @And("Click with mouse")
    public void clickWithMouse() {
        movita.movitaLogo.click();
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 10);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }

    @When("Hover the Dropdown Section")
    public void hover_the_dropdown_section() {
        ReusableMethods.hover(movita.dropDown);
        ReusableMethods.waitForClickablility(movita.dropDown, 7);
    }

    @When("Click to Dropdown and select “Türkçe” option")
    public void click_to_dropdown_and_select_türkçe_option() {
        movita.dropDown.click();
        movita.turkishOpiton.click();
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 10);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());

    }

    @Then("Click to Dropdown and select “English” option")
    public void click_to_dropdown_and_select_english_option() {
        movita.dropDown.click();
        movita.englishOption.click();
        ReusableMethods.waitForVisibility(movita.mainTextEnglish, 10);
        Assert.assertTrue(movita.mainTextEnglish.isDisplayed());
    }

    @Given("hover on ROTA OPTIMIZASYONU")
    public void hoverOnROTAOPTIMIZASYONU() {
        ReusableMethods.changingColors(movita.rotaOptimizisyonu, "#00adee");
        Assert.assertEquals(movita.rotaOptimizisyonu.getText(), "ROTA OPTIMIZASYONU");
    }

    @And("validates ROTA OPTIMIZASYONU component")
    public void validatesROTAOPTIMIZASYONUComponent() {
        ReusableMethods.seeComponent(movita.rotaOptimizisyonu);

    }

    @Given("validates UYGULAMALAR component")
    public void validates_uygulamalar_component() {
        ReusableMethods.seeComponent(movita.uygulamalar);
    }

    @And("hover on UYGULAMALAR")
    public void hover_on_uygulamalar() {
        ReusableMethods.changingColors(movita.uygulamalar, "#00adee");
        Assert.assertEquals(movita.uygulamalar.getText(), "UYGULAMALAR");
    }

    @Given("validates KILAVUZ component")
    public void validates_kılavuz_component() {
        ReusableMethods.seeComponent(movita.kılavuz);
    }

    @Given("hover on KILAVUZ")
    public void hover_on_kılavuz() {
        ReusableMethods.changingColors(movita.kılavuz, "#00adee");
        Assert.assertEquals(movita.kılavuz.getText(), "KILAVUZ");
    }

    @Given("validates İLETİŞİM component")
    public void validates_iletişim_component() {
        ReusableMethods.seeComponent(movita.iletisim);
    }

    @Given("hover on İLETİŞİM")
    public void hover_on_iletişim() {
        ReusableMethods.changingColors(movita.iletisim, "#00adee");
        Assert.assertEquals(movita.iletisim.getText(), "İLETİŞİM");
    }




}
