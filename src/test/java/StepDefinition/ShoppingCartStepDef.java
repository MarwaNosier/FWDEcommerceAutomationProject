package StepDefinition;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartStepDef {
    HomePage homePage=new HomePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));


    @When("User click on add to cart button of HTC phone")
    public void AddProduct(){
homePage.addToCartBtn().click();
}
@Then("A success message will be displayed")
    public void successMsg() throws InterruptedException {
    Thread.sleep(1000);
    String actualResult = homePage.successMsg().getText();
    String expectedResult ="The product has been added to your shopping cart";
    Assert.assertTrue(actualResult.contains(expectedResult));
}

@And("User click on Shopping cart tab")
    public void shoppingCart() throws InterruptedException {
        Thread.sleep(1000);
    wait.until(ExpectedConditions.invisibilityOf(homePage.successMsg()));
    homePage.shoppingCart().click();


}

@And("User remove product")
    public void removeBtn(){
homePage.remove().click();
}
@Then("Verify that product remove successfully")
    public void verifyProductRemove(){
        String expectedResult="Your Shopping Cart is empty!";
        String actualResult = homePage.verify().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
}
}
