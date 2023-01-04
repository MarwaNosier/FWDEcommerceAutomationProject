package StepDefinition;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class createOrderStepDef {
    HomePage homePage=new HomePage();

    @And("User agree with the terms of service")
    public void termsOfService(){
        homePage.terms_of_service().click();
    }
    @And("user click on checkout")
    public void checkoutBtn(){
        homePage.checkoutBtn().click();
    }
@And("User fill Billing address form")
    public void fill_form(){
    Select select= new Select(homePage.country_field());
    select.selectByVisibleText("Egypt");

  homePage.city_field().sendKeys("Cairo");
    homePage.address_field().sendKeys("Cairo");
    homePage.zip_field().sendKeys("12345");
    homePage.phone_field().sendKeys("0123456789");
}
    @And("User click on continue button in Billing")
    public void continue_btn_in_Billing(){
        homePage.continue_btn_in_Billing().click();
    }
    @And("User click on continue button in Shipping method")
    public void continueBtn() throws InterruptedException {
        Thread.sleep(2000);
        homePage.continueBtnShipping().click();
}


    @And("User click on continue button in Payment method")
    public void continueBtn2() throws InterruptedException {
        Thread.sleep(2000);
        homePage.continueBtnPayment().click();
    }
    @And("User click on continue button in Payment information")
    public void continueBtn3() throws InterruptedException {
        Thread.sleep(2000);
        homePage.continueBtninformation().click();
    }

@And("User click on confirm")
    public void confirmBtn() throws InterruptedException {
        Thread.sleep(2000);
homePage.confirmBtn().click();
}
@Then("Message is displayed")
    public void Message() throws InterruptedException {
        Thread.sleep(2000);
        String expected ="Your order has been successfully processed!";
        String actual= homePage.MessageSuccOrder().getText();
    Assert.assertTrue(actual.contains(expected));
}


}
