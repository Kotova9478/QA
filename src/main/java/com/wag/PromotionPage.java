package com.wag;


import javafx.scene.control.PasswordField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PromotionPage extends BasePage {

    public PromotionPage(WebDriver driver){
        super(driver);}


    @FindBy(css = "input[type=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[type=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[type=\"tel\"]")
    private WebElement phoneField;

    @FindBy(css = "p.sc-gzVnrw.htpxiB")
    private WebElement nextButton;

    @FindBy(css = "p.sc-gzVnrw.bMAZbm")
    private List<WebElement> confirmNotification;

    @FindBy(css = ".sc-bdVaJa.sc-gZMcBi.giglCC")
    private List<WebElement> errorFilds;


    public void inputEmailField(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }


    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        lastNameField.sendKeys(lastName);
    }

    public void inputPhone(String phone){
        phoneField.sendKeys(phone);
    }

        public String getEmail(){
            String resEmail = emailField.getAttribute("value");
        return resEmail;}

        public String getPassword() {
            String resPassword = passwordField.getAttribute("value");
            return resPassword;
        }
        public String getFirstName(){
         String resFirstName = firstNameField.getAttribute("value");
         return resFirstName;
        }
        public String getLastName(){
         String resLastName = lastNameField.getAttribute("value");
         return resLastName;
        }
        public String getPhoneNumber(){
         String resPhone = phoneField.getAttribute("value");
         return resPhone;
        }
        public String getConfirmNotification(){
        String resNotification = confirmNotification.get(1).getText();
        return resNotification;
        }

        public String getErrorEmailField(){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        String error0 = errorFilds.get(0).getText();
        return error0;
        }
        public String getErrorFirstNameField(){
        String error1 = errorFilds.get(1).getText();
        return error1;
        }



        public String cklickNextButton(){
        nextButton.click();

        String result = nextButton.getText();

        return result;
    }
}

