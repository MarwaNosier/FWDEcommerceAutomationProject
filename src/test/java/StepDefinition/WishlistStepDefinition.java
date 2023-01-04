package StepDefinition;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishlistStepDefinition {
    HomePage homePage=new HomePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));


    @When("User click on add to wishlist button of HTC phone")
    public void clickOnWishlistBtn(){
            homePage.HTCWishlistBtn().click();
    }
    @Then("Green success message will be displayed")
    public void successMSG() throws InterruptedException {
        Thread.sleep(1000);

        String  expectedColor ="#4bb07a";
        String actualColor=homePage.GreenMessage().getCssValue("background-color");
        actualColor= Color.fromString(actualColor).asHex();
        Assert.assertEquals(actualColor, expectedColor);

        String actualResult=homePage.GreenMessage().getText();
        String expectedResult="The product has been added to your wishlist";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
    @And("User click on Wishlist tab")
    public void pressOnWishlistBtn() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.invisibilityOf(homePage.GreenMessage()));

        homePage.wishTab().click();
    }
    @Then("User will be navigated to wishlist page")
    public void verifyProductQuantity(){
            int productQTY=Integer.parseInt(homePage.productQuantity().getAttribute("value"));
            Assert.assertTrue(productQTY>0);
    }



}
