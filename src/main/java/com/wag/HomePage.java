package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".sc-bdVaJa.sc-bwzfXH.jUXfpw.button.p")
    private WebElement walkFreeButton;

    @FindBy(css = "p.sc-EHOje.hjXGpR")
    private List<WebElement> guideButtons;


    @FindBy (css = ".sc-EHOje.cWxJHM")
    private WebElement becameAWalkerButton;

   // public void clickWalkFreeButton(){
       // walkFreeButton.click();

    public PromotionPage clickWalkFreeButton(){

        wait.until(ExpectedConditions.elementToBeClickable(walkFreeButton));

        walkFreeButton.click();
        return new PromotionPage(driver);

        //some code
    }
    public LoginPage clickLoginPageGuide(){

        wait.until(ExpectedConditions.elementToBeClickable(guideButtons.get(3)));

       guideButtons.get(3).click();
       return new LoginPage(driver);

    }
    public BecomeAWalkerPage openBecomeAWalkerPage(){
        wait.until(ExpectedConditions.elementToBeClickable(becameAWalkerButton));

        becameAWalkerButton.click();
        return new BecomeAWalkerPage(driver);
    }
     public BecomeAWalkerPage clickBecomeWalker(){

        wait.until(ExpectedConditions.elementToBeClickable(guideButtons.get(0)));
        guideButtons.get(0).click();
        return new BecomeAWalkerPage(driver);

    }
}
