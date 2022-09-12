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
        ReusableMethods.waitForVisibility(movita.mainTextEnglish,10);
        Assert.assertTrue(movita.mainTextEnglish.isDisplayed());
    }


}
