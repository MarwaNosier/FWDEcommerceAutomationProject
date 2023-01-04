package StepDefinition;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchStepDefinition {
    HomePage search =new HomePage();
    @When("User search using product name {string}")
    public void searchUsingName(String name){
            search.searchField().sendKeys(name);
    }

    @And("User click on Search button")
    public void searchBtn(){
        search.searchButton().click();
    }
    @Then("Products that appears will be related to the product name \"(.*)\"$")
    public void searchResultsUsingName(String name){
        List<WebElement> products = search.searchResults();
        for (WebElement product :products){
            Assert.assertTrue(product.getText().toLowerCase().contains(name));
        }
    }
    @When("User search with product sku {string}")
    public void searchUsingSku(String sku){
        search.searchField().sendKeys(sku);
    }
    @Then("Products that appears will be related to the product sku \"(.*)\"$")
    public void searchResultsUsingSku(String sku){
        search.searchResults().get(0).click();
        Assert.assertTrue(search.getProductSku().getText().contains(sku));

    }

}

