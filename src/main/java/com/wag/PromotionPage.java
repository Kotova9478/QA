package com.wag;


import javafx.scene.control.PasswordField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    @FindBy(css = ".sc-bdVaJa.sc-gZMcBi.giglCC")
    private WebElement incorrectMailField;

   // @FindBy(css = "")
   // private WebElement loginButton;

    public void inputEmailField(String email) {

        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }


    public void inputPassword(String password) {

        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
    }

    public void inputFirstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        wait.until((ExpectedConditions.elementToBeClickable(lastNameField)));
        lastNameField.sendKeys(lastName);
    }

    public void inputPhone(String phone){
        wait.until((ExpectedConditions.elementToBeClickable(phoneField)));
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


        public void clickEmailField(){
        emailField.click();
        }
        public void clickFirstNameField(){
        firstNameField.click();
        }
        public void clickLastNameField(){
        lastNameField.click();
        }
        public void clickPhoneNumberField(){
        phoneField.click();
        }


        
        public String getErrorEmailField(){
        //wait.until(ExpectedConditions.visibilityOf(errorFilds.get(0)));
        String error0 = errorFilds.get(0).getText();
        return error0;
        }
        public String getErrorFirstNameField(){
        String error1 = errorFilds.get(1).getText();
        return error1;
        }
        public String getErrorLastNameField(){
        String error2 = errorFilds.get(2).getText();
        return error2;
        }
        public String getErrorPhoneNumberField(){
        String error3 = errorFilds.get(3).getText();
        return error3;
        }
        //public void inputWrongEmail(String emailWrong){
       // emailField.sendKeys(emailWrong);
       // }
       // public void inputWrongPassword(String passwordWrong){
       // passwordField.sendKeys(passwordWrong);
       // }
       // public String clickLoginButton(){
       // }

        public String cklickNextButton(){
        nextButton.click();

        String result = nextButton.getText();

        return result;





        //Sasha is magic!
    }
}

