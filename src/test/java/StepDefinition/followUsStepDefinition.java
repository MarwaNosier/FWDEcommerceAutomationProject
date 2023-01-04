package StepDefinition;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class followUsStepDefinition {
    HomePage home = new HomePage();
    @When("User click on Facebook icon")
    public void clickOnFacebookIcon(){
        home.facebookIcon().click();
    }
    @When("User click on Twitter icon")
    public void clickOnTwitterIcon(){
        home.twitterIcon().click();
    }
    @When("User click on RSS icon")
    public void clickOnRSSIcon(){
        home.RSSIcon().click();
    }
    @When("User click on Youtube icon")
    public void clickOnYoutubeIcon(){
        home.YouTubeIcon().click();
    }

    @Then("New tab will be opened with this URL {string}")
    public void openedURL(String url) throws InterruptedException {
        List<String> tab =new ArrayList<>(Hooks.driver.getWindowHandles());

            Thread.sleep(2000);
            ArrayList<String> openedTabs =new ArrayList<String>(Hooks.driver.getWindowHandles());
            if (openedTabs.size()>1){
                Hooks.driver.switchTo().window(tab.get(1));

        }else {

                Hooks.driver.switchTo().window(tab.get(0));
            }
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), url);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tab.get(0));
    }
}
