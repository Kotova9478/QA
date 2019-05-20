package com.wag;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected WebDriver driver;

    protected User user;

    protected HomePage homePage;

    protected WebDriverWait wait;

    protected UserWalker userWalker;

    @Before
    public void setDrivver(){

        System.setProperty("webdriver.chrome.driver", "/Users/lesia/Downloads/chromedriver");
        //WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();

        driver.get("https://wagWalking.com");

        String titleExpected = "Wadwalking.com - Leading Local Dog Walker Service For Dog Owners";

        user = new User();

        homePage = new HomePage(driver);

        wait = new WebDriverWait(driver,10);

        userWalker = new UserWalker();
    }

    @After
    public void close(){

       // driver.quit();

    }
}
