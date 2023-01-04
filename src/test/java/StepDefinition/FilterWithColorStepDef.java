package StepDefinition;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;

public class FilterWithColorStepDef {
    HomePage homePage=new HomePage();
    @And("user select color option")
    public void selectColor(){
         homePage.select_color().click();
    }

    @Then("Only products have this color is appeared")
    public void verifyResult() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult=homePage.productResults().getText();
        String expectedResult="adidas Consortium Campus 80s Running Shoes";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
