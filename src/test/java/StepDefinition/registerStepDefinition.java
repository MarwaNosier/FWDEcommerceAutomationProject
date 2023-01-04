package StepDefinition;

import Pages.Register;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.support.ui.Select;

public class registerStepDefinition {

    Register register = new Register();
    @Given("user navigates to register page")
    public void user_navigates(){
        register.registerPage().click();
    }
    @When("user choose Gender")
    public void chooseGender(){
        register.genderCheckBox().click();
    }

    @And("user enter valid first name")
    public void firstName(){
        register.firstName().sendKeys("Marwa");
    }
    @And("user enter valid last name")
    public void lastName(){
        register.lastName().sendKeys("Nosier");
    }

    @And("user select valid Date of birth")
    public void DateOfBrith(){
        Select day=new Select(register.brithDay());
        day.selectByValue("8");

        Select month=new Select(register.brithMonth());
        month.selectByValue("6");

        Select year=new Select(register.brithYear());
        year.selectByValue("2000");

    }
    @And("user enter valid email address")
    public void emailAddress(){
        register.email().sendKeys(register.validEmail());
    }

    @And("user enter valid password")
    public void password(){
        register.password().sendKeys(register.validPassword());
    }

    @And("user enter again the same valid password")
    public void confirmPassword(){
        register.confirmPassword().sendKeys(register.validPassword());
    }
    @And("user clicks on register button")
    public void registerButton(){
        register.registerButton().click();
    }
    @Then("success message is displayed")
    public void successMessage(){
        String actualResult = register.successMessage().getText();
        String expectedResult = "Your registration completed";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


    @And("user enter exit email address")
    public void exitEmail(){
        register.email().sendKeys(register.validEmail());
    }
    @Then("error message is displayed")
    public void errorMessage() {
        String actualResult = register.errorMessage().getText();
        String expectedResult = "The specified email already exists";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }




}
