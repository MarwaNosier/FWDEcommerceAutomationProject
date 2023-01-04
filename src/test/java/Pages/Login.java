package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static StepDefinition.Hooks.driver;

public class Login {

    public WebElement loginURL(){
        By login_url=By.className("ico-login");
        return driver.findElement(login_url);
    }
     public WebElement email(){
        By email = By.id("Email");
        return driver.findElement(email);
     }
    public WebElement password(){
        By password = By.id("Password");
        return driver.findElement(password);
    }
    public void loginSteps(String email,String password){
        email().sendKeys(email);
        password().sendKeys(password);

    }
    public WebElement loginButton(){
        By loginBtn =By.cssSelector("button[class=\"button-1 login-button\"]");
        return driver.findElement(loginBtn);
    }

    public WebElement wronglogin(){
        By wronglogin=By.id("Email-error");
        return driver.findElement(wronglogin);
    }


    //**** restPassword **//

    public WebElement forgetPassBtn(){
        By forgetPassBtn =By.className("forgot-password");
        return driver.findElement(forgetPassBtn);
    }


    public WebElement recoverBtn(){
        By recoverBtn=By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
        return driver.findElement(recoverBtn);
    }

    public WebElement Message(){
        By Message =By.id("bar-notification");
        return driver.findElement(Message);
    }

}
