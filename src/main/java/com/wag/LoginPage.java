package com.wag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver){
    super (driver);
}

    @FindBy(css = "input.form-control.")
    private List<WebElement> loginFields;

    @FindBy(css = "input[email-input]")
    private WebElement emailField;

    @FindBy(css = "input[password-input]")
    private WebElement passwordField;
   // @FindBy(css = "input.form-control.")
    //private WebElement passwordField;

    @FindBy(css = "button.btn.btn-secondary.btn-block")
    private WebElement clickLogin;

    @FindBy(css = "div.LoginForm_alert__3qBVt bootstrap_alert__1i5SZ bootstrap_alert-warning__10OLC")
    private WebElement invalidRedentials;

    //@FindBy(css = "LoginForm_alert__3qBVt bootstrap_alert__1i5SZ bootstrap_alert-warning__10OLC")
    //private WebElement allertButton;

    public void inputEmailField(String email){
       //wait.until(ExpectedConditions.elementToBeClickable(By.id(emailField)));
     emailField.sendKeys(email);

    }
    public void inputPusswordField(String password){
        //wait.until(ExpectedConditions.elementToBeClickable(password));
        passwordField.sendKeys(password);
    }
    public void clickLoginField(){
        clickLogin.click();
    }
    public String getEmail(){
       String email = emailField.getAttribute("value");
        return email;
    }
    public String getPassword(){
       String password = passwordField.getAttribute("value");
        return password;
    }
      public String getAllertField(){
        clickLogin.click();

       String allert = invalidRedentials.getText();
       return allert;


    }
}
