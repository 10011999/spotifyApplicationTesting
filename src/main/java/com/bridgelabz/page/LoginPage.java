package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    @FindBy(id = "login-username")
    private WebElement username;
    @FindBy(id = "login-password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginBtn;

    // initialization
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String uname, String pwd) {
        username.sendKeys(uname);
        password.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }

    public String verifyLoginPageTitle() {
        return driver.getTitle();
    }
}
