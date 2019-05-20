package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BecomeAWalkerPage extends BasePage {

    public BecomeAWalkerPage (WebDriver driver){
        super(driver);
    }

    @FindBy (css = "#first_name")
    private WebElement firstNameField;

    @FindBy(css = "#last_name")
    private WebElement lastNameField;

    @FindBy(css = "#email")
    private WebElement emailField;

    @FindBy(css = "#phone")
    private WebElement phoneField;

    @FindBy(css = "#address__line-one")
    private WebElement addressField;

    @FindBy(css = ".autocomplete-result")
    private List<WebElement> addressActiveField;

    @FindBy(css = "#city")
    private WebElement city;

    @FindBy(css ="#address__line-two" )
    private WebElement aptField;

    @FindBy(css = "#zipcode")
    private WebElement zipcode;

    @FindBy(css = ".btn.common-dropdown.common-dropdown-item")
    private WebElement state;

    @FindBy(css = ".button-text")
    private WebElement applayNowButton;


    public void inputFirstNameField(String firstName){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }
    public void inputLastNameField(String lastName){
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }
    public void inputEmailField(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }
    public void inputPhone(String phone){
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);
    }
    public void inputAddress(String address){
        wait.until(ExpectedConditions.elementToBeClickable(addressField));
        addressField.sendKeys(address);
    }

    public void inputApt(String apt) {
        wait.until(ExpectedConditions.elementToBeClickable(aptField));
        aptField.sendKeys(apt);
    }
        public void confirmAddress(){
          wait.until(ExpectedConditions.visibilityOfAllElements(addressActiveField));
            int size = addressActiveField.size();
            System.out.println(size);
            addressActiveField.get(1).click();

    }
    public void clickApplay(){
        wait.until(ExpectedConditions.elementToBeClickable(applayNowButton));
        applayNowButton.click();

    }
}

