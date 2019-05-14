package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class PromotionPageDublicut extends BasePage {

    public PromotionPageDublicut(WebDriver driver){

        super (driver);
    }

       @FindBy(css = "input")
        private List<WebElement> fields;

        @FindBy(css = "p.sc-gzVnrw.htpxiB")
        private WebElement buttonNext;


    public void inputEmailField(String email) {
        wait.until(ExpectedConditions.visibilityOfAllElements(fields));
        fields.get(0).sendKeys(email);
    }

    public void inputPassword(String password) {
        fields.get(1).sendKeys(password);
    }

    public void inputFirstName(String firstName) {
        fields.get(2).sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        fields.get(3).sendKeys(lastName);
    }

    public void inputPhone(String phone){
        fields.get(4).sendKeys(phone);
    }

    public ArrayList<String> getData() {

        ArrayList<String> listData = new ArrayList<String>();

       String res0 = fields.get(0).getAttribute("value");
       listData.add(res0);
       String res1 = fields.get(1).getAttribute("value");
       listData.add(res1);
       String res2 = fields.get(2).getAttribute("value");
       listData.add(res2);
       String res3 = fields.get(3).getAttribute("value");
       listData.add(res3);
       String res4 = fields.get(4).getAttribute("value");
       listData.add(res4);

        return listData;
    }
}
