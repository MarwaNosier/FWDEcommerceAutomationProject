package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class Register {

        public WebElement registerPage(){
            By registerTag = By.className("ico-register");
            return driver.findElement(registerTag);
        }
        public WebElement genderCheckBox(){
             By genderCheckBox =By.id("gender-female");
             return driver.findElement(genderCheckBox);
          }

          public WebElement firstName(){
              By firstname = By.id("FirstName");
              return driver.findElement(firstname);
          }
    public WebElement lastName(){
        By lastname = By.id("LastName");
        return driver.findElement(lastname);
    }

    public WebElement brithDay(){
              By Day =By.name("DateOfBirthDay");
              return driver.findElement(Day);
    }
    public WebElement brithMonth(){
        By Month =By.name("DateOfBirthMonth");
        return driver.findElement(Month);
    }
    public WebElement brithYear(){
        By Year =By.name("DateOfBirthYear");
        return driver.findElement(Year);
    }

    public WebElement email(){
         By email = By.id("Email");
         return driver.findElement(email);
    }
    public String validEmail() {
        return "test862000@gmail.com";
    }

    public WebElement password(){
        By password = By.id("Password");
        return driver.findElement(password);

    }
    public WebElement confirmPassword(){
        By confirmPassword = By.id("ConfirmPassword");
        return driver.findElement(confirmPassword);

    }
    public String validPassword() {
        return "password123";
    }

    public WebElement registerButton(){
              By registerBtn =By.id("register-button");
              return driver.findElement(registerBtn);
    }
    public WebElement successMessage() {
        By successMsg = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(successMsg);
    }

    public WebElement errorMessage(){
              By errorMsg = By.className("message-error");
              return driver.findElement(errorMsg);

    }
}
