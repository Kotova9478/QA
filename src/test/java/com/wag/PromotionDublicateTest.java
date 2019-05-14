package com.wag;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PromotionDublicateTest extends BaseTest {

    private HomePage homePage;

    @Test
    public void promotionDuplicateTest(){
       homePage = new HomePage(driver);
       homePage.clickWalkFreeButton();

       PromotionPageDublicut promotionPageDublicut = new PromotionPageDublicut(driver);

       User userDuplicate = new User();

       promotionPageDublicut.inputEmailField(userDuplicate.getEmail());

       promotionPageDublicut.inputPassword(userDuplicate.getPassword());

       promotionPageDublicut.inputFirstName(userDuplicate.getFirstName());

       promotionPageDublicut.inputLastName(userDuplicate.getLastName());

       promotionPageDublicut.inputPhone(userDuplicate.getPhoneNumber());


       promotionPageDublicut.getData();


     // String list1 = promotionPageDublicut.getConfirmList1();
    }
}
