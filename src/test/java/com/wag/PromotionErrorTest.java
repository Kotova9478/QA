package com.wag;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PromotionErrorTest extends BaseTest {
    private HomePage homePage;
    private PromotionPage promotionPage;

    @Test

    public void errorTest(){
        homePage = new HomePage(driver);
       promotionPage = homePage.clickWalkFreeButton();

        promotionPage.clickEmailField();
        promotionPage.clickFirstNameField();
        promotionPage.clickLastNameField();
        promotionPage.clickPhoneNumberField();
        promotionPage.clickEmailField();


        String error0 = promotionPage.getErrorEmailField();
        System.out.println(error0);
        Assert.assertEquals("required", error0);

       String error1 = promotionPage.getErrorFirstNameField();
        System.out.println(error1);
        Assert.assertEquals("required", error1);

        String error2 = promotionPage.getErrorLastNameField();
        System.out.println(error2);
        Assert.assertEquals("required", error2);

        String error3 = promotionPage.getErrorPhoneNumberField();
        System.out.println(error3);
        Assert.assertEquals("required", error3);


        promotionPage.getErrorEmailField();





    }


}
