package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.Collections;
import java.util.List;
import static StepDefinition.Hooks.driver;
public class HomePage {

          // **** Currencies us && euro **** //
    public WebElement currencyDropDown() {
        By currency= By.id("customerCurrency");
        return driver.findElement(currency);
    }
    public List<WebElement> itemsPrices(){
        By items=By.className("prices");
        return Collections.singletonList(driver.findElement(items));
    }


    // **** search by name && sku  **** //
    public WebElement searchField(){
        By searchField=By.id("small-searchterms");
       return driver.findElement(searchField);
    }
    public WebElement searchButton(){
        By searchButton = By.xpath("//*[@class=\"button-1 search-box-button\"]");
        return driver.findElement(searchButton);
    }
    public List<WebElement> searchResults(){
        By searchResults=By.className("item-box");
        return Collections.singletonList(driver.findElement(searchResults));
    }

    public WebElement getProductSku(){
        By product_Sku = By.xpath("//*[@class=\"sku\"]/span[2]");
        return driver.findElement(product_Sku);
    }



         // **** Header Menu (Main Category && sub category **** //
public WebElement MainCategory(){

     // * Computer Main Category *//
   // By MainCategory = By.xpath("//ul[@class='top-menu notmobile']/li[1]/a");

    //** apparel Main Category **/
     By MainCategory = By.xpath("//ul[@class='top-menu notmobile']/li[3]/a");

    return driver.findElement(MainCategory);
}

    public WebElement SubCategory(){


        // * Desktop Sub Category *//
//        By SubCategory = By.xpath("//ul[@class='top-menu notmobile']/li[1]/ul/li[1]/a");

        // * Shoes Sub Category *//
        By SubCategory = By.xpath("//ul[@class='top-menu notmobile']/li[3]/ul/li[1]/a");

        return driver.findElement(SubCategory);
    }

    public WebElement subCategoryPageTitle(){
        By subCategory_PageTitle = By.xpath("//*[@class='page-title']");
        return driver.findElement(subCategory_PageTitle);
    }

            //********* follow us ***** //
    public WebElement facebookIcon(){
        By facebookIcon = By.className("facebook");
        return driver.findElement(facebookIcon);
    }
    public WebElement twitterIcon(){
        By twitterIcon = By.className("twitter");
        return driver.findElement(twitterIcon);
    }

    public WebElement RSSIcon(){
        By RSSIcon = By.className("rss");
        return driver.findElement(RSSIcon);
    }

    public WebElement YouTubeIcon(){
        By YouTubeIcon = By.className("youtube");
        return driver.findElement(YouTubeIcon);
    }

                   //********* Wishlist ***** //
    public WebElement HTCWishlistBtn(){
     By Btn =By.xpath("(//*[@class=\"button-2 add-to-wishlist-button\"])[3]");
        return driver.findElement(Btn);
    }
    public WebElement GreenMessage(){
        By GreenMessage =By.xpath("//*[@class=\"bar-notification success\"]");
        return driver.findElement(GreenMessage);
    }
    public WebElement wishTab(){
        By  wishTab=By.xpath("//*[@class=\"wishlist-label\"]");
        return driver.findElement(wishTab);
    }
    public WebElement productQuantity(){
        By productQuantity=By.xpath("//*[@class=\"qty-input\"]");
        return driver.findElement(productQuantity);
    }

                //********* Shopping cart    ***** //

    public WebElement addToCartBtn(){
        By addToCartBtn=By.xpath("(//*[@class=\"button-2 product-box-add-to-cart-button\"])[3]");
        return driver.findElement(addToCartBtn);

    }
    public WebElement successMsg(){
        By Msg=By.id("bar-notification");
        return driver.findElement(Msg);
    }
    public WebElement shoppingCart(){
        By shoppingCart=By.className("cart-label");
//                xpath("//*[@class=\"ico-cart\"]");
        return driver.findElement(shoppingCart);

    }
public WebElement remove(){
    By remove=By.xpath("//*[@class=\"remove-btn\"]");
return driver.findElement(remove);
}
public WebElement verify(){
        By verify = By.className("no-data");
        return driver.findElement(verify);
}


                 // ***** Filter With color ****//

    public WebElement select_color(){
        By color =By.id("attribute-option-15");
        return driver.findElement(color);
    }

    public WebElement productResults(){
        By productResults =By.className("details");
        return driver.findElement(productResults);
    }


    // ********* create Order ***//
    public WebElement terms_of_service(){
        By agree_terms = By.id("termsofservice");
        return driver.findElement(agree_terms);
    }

    public WebElement checkoutBtn(){
        By checkout_btn =By.id("checkout");
        return driver.findElement(checkout_btn);
    }

    public WebElement country_field(){
          By country_field =By.id("BillingNewAddress_CountryId");
          return driver.findElement(country_field);
    }
    public WebElement state_field(){
      By state_field=  By.id("BillingNewAddress_StateProvinceId");
return driver.findElement(state_field);
    }
    public WebElement city_field(){

return driver.findElement(By.id("BillingNewAddress_City"));
    }
    public WebElement address_field(){
return driver.findElement(By.id("BillingNewAddress_Address1"));
    }
    public WebElement zip_field(){
return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phone_field(){
return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }

    public WebElement continue_btn_in_Billing(){
        By continue_btn=By.xpath("//div[@id=\"billing-buttons-container\"]/button[@class=\"button-1 new-address-next-step-button\"]");
        return driver.findElement(continue_btn);
    }
public WebElement continueBtnShipping(){
        By continueBtn=By.xpath("//div[6]/div[@class=\"master-wrapper-content\"]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button[@class=\"button-1 shipping-method-next-step-button\"]");
        return driver.findElement(continueBtn);
}
    public WebElement continueBtnPayment(){
        By continueBtn=By.xpath("/html/body/div[@class=\"master-wrapper-page\"]/div[@class=\"master-wrapper-content\"]/div/div/div/div[@class=\"page-body checkout-data\"]/ol/li[@id=\"opc-payment_method\"]/div[@id=\"checkout-step-payment-method\"]/div[@id=\"payment-method-buttons-container\"]/button");
        return driver.findElement(continueBtn);
    }
    public WebElement continueBtninformation(){
        By continueBtn=By.xpath("//div[6]/div[@class=\"master-wrapper-content\"]/div/div/div/div[2]/ol/li[5]/div[2]/div/button");
        return driver.findElement(continueBtn);
    }
    public WebElement confirmBtn(){
        By confirmBtn=By.xpath("//div[6]/div[@class=\"master-wrapper-content\"]/div/div/div/div[2]/ol/li[6]/div[2]/div/button[@class=\"button-1 confirm-order-next-step-button\"]");
        return driver.findElement(confirmBtn);
    }

public WebElement MessageSuccOrder(){
        By Message=By.xpath("//*[@class=\"title\"]/strong");
        return driver.findElement(Message);

}

}


