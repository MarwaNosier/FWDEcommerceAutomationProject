package StepDefinition;

import Pages.Login;
import Pages.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.Color;

public class resetPasswordStepDef {
Login login=new Login();
Register register=new Register();
 @When("user click on Forgot password")
    public void forgetPasswordBtn(){
     login.forgetPassBtn().click();
 }
 @And("user enter his email")
    public void enter_email(){

  login.email().sendKeys(register.validEmail());

 }
 @And("user click on Recover button")
    public void clickOnRecoverBtn(){
login.recoverBtn().click();
 }
 @Then("Message Email with instructions has been sent to user is displayed")
    public void Message(){
     String actualResult = login.Message().getText();
     String expectedResult ="Email with instructions has been sent to you.";
     Assert.assertTrue(actualResult.contains(expectedResult));

 }


    @And ("user enter error email")
    public void errorEmail(){
       login.email().sendKeys("test12@mozej.com");
    }

    @Then("Red Message Email not found is displayed")
    public void errorMsg(){
//     String expectedColor ="#e4444c";
//     String actualColor = login.Message().getCssValue("background-color");
//actualColor= Color.fromString(actualColor).asHex();
//Assert.assertEquals(actualColor,expectedColor);

        String actualResult = login.Message().getText();
        String expectedResult ="Email not found";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
