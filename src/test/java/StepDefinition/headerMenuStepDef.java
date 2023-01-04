package StepDefinition;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class headerMenuStepDef {
    HomePage homePage=new HomePage();
    String Sub_Category;

    @When("User hover on main categories then click on sub categories")
    public void MainCategories_SubCategory(){

        Actions action = new Actions(Hooks.driver);
        action.moveToElement(homePage.MainCategory()).moveToElement(homePage.MainCategory()).build().perform();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(homePage.MainCategory()));
        Sub_Category = homePage.SubCategory().getText().toLowerCase().trim();
        action.moveToElement(homePage.MainCategory()).moveToElement(homePage.SubCategory()).click().build().perform();

    }
    @Then("User will be navigated to a page  of subCategory that he selected")
    public void resultOfSub() {

        //** Shoes subCategory **//
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("shoes"));
        Assert.assertEquals(homePage.subCategoryPageTitle().getText(), "Shoes");
       Assert.assertTrue(homePage.subCategoryPageTitle().getText().
                toLowerCase().equals(Sub_Category));


                        //** Desktop subCategory **//
//                 Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("desktops"));
//        Assert.assertEquals(homePage.subCategoryPageTitle().getText(), "Desktops");
//       Assert.assertTrue(homePage.subCategoryPageTitle().getText().
//                toLowerCase().equals(Sub_Category));
    }

}
