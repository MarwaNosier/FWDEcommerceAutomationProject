package StepDefinition;

import Pages.HomePage;
import Pages.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class currenciesStepDefinition {

    HomePage home=new HomePage();
     Login login=new Login();



    @Given("User redirects to Home page")
    public void redirects_to_homePage(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/"));
    }
    @When("User select Euro from drop down list")
    public void selectCurrency(){
        Select select= new Select(home.currencyDropDown());
        select.selectByVisibleText("Euro");
    }
    @Then("Currency of product is changed into Euro")
    public void checkCurrency(){
      List<WebElement> itemPrices =home.itemsPrices();


        for (WebElement itemPrice :itemPrices){
            Assert.assertTrue(itemPrice.getText().contains("€"));
        }
    }


}
