package com.wag;

import org.junit.Test;

public class BecameAWalkerTest extends BaseTest {
    private HomePage homePage;
    private BecomeAWalkerPage becomeAWalkerPage;

    @Test
    public void testBecameAWalker(){

        homePage = new HomePage(driver);
       becomeAWalkerPage = homePage.openBecomeAWalkerPage();
       becomeAWalkerPage.inputFirstNameField(userWalker.getFirstName());
       becomeAWalkerPage.inputLastNameField(userWalker.getLastName());
       becomeAWalkerPage.inputEmailField(userWalker.getEmail());
       becomeAWalkerPage.inputPhone(userWalker.getPhoneNumber());
       becomeAWalkerPage.inputAddress(userWalker.getAddress());
       becomeAWalkerPage.confirmAddress();
       becomeAWalkerPage.inputApt(userWalker.getApt());
       becomeAWalkerPage.clickApplay();

    }
}
