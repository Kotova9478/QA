package com.wag;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectEmailTest extends BaseTest {
    private HomePage homePage;
    private PromotionPage promotionPage;


        @Test
         public void testIncorrectEmail(){

            homePage =  new HomePage(driver);
        promotionPage =  homePage.clickWalkFreeButton();

        promotionPage.inputEmailField(user.getIncorrectEmail());
        promotionPage.clickFirstNameField();
        String error = promotionPage.getErrorEmailField();
            Assert.assertEquals("please provaide a valid email", error);

    }
}
