package StepDefinition;

import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static StepDefinition.Hooks.driver;
public class loginStepDefinition {

    Login login=new Login();

    @Given("user go to login page")
    public void loginPage() {
        login.loginURL().click();
          }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void data(String email, String password) {
        login.loginSteps(email, password);
    }

    @And("user click on login button")
    public void loginButton() {
        login.loginButton().click();
    }

    @Then("user could login successfully and go to home Page")
    public void successLogin() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");

    }



    @Then("user could not login successfully")
    public void wrong_login() {
        String expectedResult = "Wrong email";
        String actualResult = login.wronglogin().getText();
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}