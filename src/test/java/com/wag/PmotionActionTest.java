package com.wag;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class PmotionActionTest extends BaseTest{

    // private HomePage homePage;
    private PromotionPage promotionPage;


    @Test
    public void testPromotionAction (){

       // String titleExpected = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners | WagWalking.com - Leading Local Dog Walker Service for Dog Owners";
       // String titleActual = driver.getTitle();
      //  Assert.assertTrue(titleExpected.equals(titleActual));

        /*DELITE

        driver.findElement(By.cssSelector(".sc-bdVaJa.sc-bwzfXH.jUXfpw button p")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(input[type="email"])).sendKeys("my@gmail.com");
        driver.findElement(By.cssSelector(".sc-VigVT dHbMnE")).sendKeys("Password");
        driver.findElement(By.cssSelector(".sc-VigVT dHbMnE")).sendKeys("Ivan");
        driver.findElement(By.cssSelector(".sc-VigVT dHbMnE")).sendKeys("Ivanov");
       // driver.findElement(By.cssSelector("
        driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("my@gmail.com");
       // String result = driver.findElement(By.cssSelector(".sc-dnqmqq jaqUMc")).getText();
        String result = driver.findElement(By.cssSelector(".sc-ifAKCX.kwKKLq")).getText();
        Assert.assertEquals("NEXT", result);*/

       //homePage = new HomePage(driver);

      promotionPage = homePage.clickWalkFreeButton();

      // PromotionPage promotionPage = new PromotionPage(driver);

      // User user = new User();

       promotionPage.inputEmailField(user.getEmail());

       promotionPage.inputPassword(user.getPassword());

       promotionPage.inputFirstName(user.getFirstName());

       promotionPage.inputLastName(user.getLastName());

       promotionPage.inputPhone(user.getPhoneNumber());

       String email = promotionPage.getEmail();
       Assert.assertEquals("my@gmail.com",email);

       String password = promotionPage.getPassword();
       Assert.assertEquals("123",password);

       String firstName = promotionPage.getFirstName();
       Assert.assertEquals("Ivan", firstName);

       String lastName = promotionPage.getLastName();
       Assert.assertEquals("Petrov",lastName);

       String phone = promotionPage.getPhoneNumber();
       Assert.assertEquals("(123) 456-7890", phone);

       String notification = promotionPage.getConfirmNotification();
       Assert.assertEquals("Let's start with the basics", notification);


       String errorEmail = promotionPage.getErrorEmailField();
       Assert.assertEquals("required", errorEmail);



       String res = promotionPage.cklickNextButton();
       Assert.assertEquals("NEXT",res);




            System.out.println("Finish");
            driver.quit();
       }
    }




