package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//label[text()='Allow all cookies']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(id = "dialog_accept_all")
    WebElement acceptAllCookies;


    @CacheLookup
    @FindBy(xpath = "//a[@title = 'Live Casino']//child:: span")
    WebElement liveCasino;

    //span[text()='Live Casino']

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Try Live Casino - Live Action Dealers & Selection')]")
    WebElement tryLiveCasino;


    public void captchaAcceptCookies(){
        clickOnElement(acceptCookies);
    }

    public void captchaAcceptCookies2(){
        clickOnElement(acceptAllCookies);
    }

    public void clickOnLiveCasino() {
        clickOnElement(liveCasino);
    }

    //Try Live Casino - Live Action Dealers & Selection of Games
    public String verifyTextLiveCasino(){
        log.info("Try Live Casino - Live Action Dealers & Selection of Games" + tryLiveCasino.toString());
        return getTextFromElement(tryLiveCasino);
    }

}
