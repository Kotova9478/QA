package com.wag;

import org.junit.Test;

public class LoginInvalidDataTest extends BaseTest{

    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void testLoginInvalidData(){

        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginPageGuide();

        loginPage.inputEmailField(user.getEmail());
        loginPage.inputPusswordField(user.getPassword());
        loginPage.clickLoginField();
        loginPage.getAllertField();
    }



}
