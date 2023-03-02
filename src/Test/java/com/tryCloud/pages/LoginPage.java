package com.tryCloud.pages;


import com.tryCloud.utilities.Driver;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement userName;



    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement LoginSubmitBtn;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        LoginSubmitBtn.click();
        // verification that we logged
    }

}