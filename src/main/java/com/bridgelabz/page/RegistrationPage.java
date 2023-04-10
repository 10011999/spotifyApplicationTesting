package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {
    @FindBy(name = "email")
    private WebElement username;
    @FindBy(name = "confirm")
    private WebElement confirmEmail;

    @FindBy(name = "password")
    private WebElement password;
    @FindBy(name = "displayname")
    private WebElement displayName;

//    @FindBy(xpath = "//select[@id='month']']")
//    private WebElement month;
//    @FindBy(xpath = "//input[@id='day']")
//    private WebElement day;
//    @FindBy(xpath = "//input[@id='year']")
//    private WebElement year;

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage registrtion(String uname, String confirmMail, String dName, String pwd) {
        username.sendKeys(uname);
        confirmEmail.sendKeys(confirmMail);
        password.sendKeys(pwd);
        displayName.sendKeys(dName);
//        month.sendKeys(months);
//        day.sendKeys(days);
//        year.sendKeys(years);

        return new HomePage();
    }

    public String verifyRegistrationPageTitle() {
        return driver.getTitle();
    }
}
