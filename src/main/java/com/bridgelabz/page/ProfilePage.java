package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BaseClass {
    @FindBy(xpath = "//span[contains(text(),'Web Player')]")
    private WebElement profileLink;

    public ProfilePage gotoProfile() {
        profileLink.click();
        return new ProfilePage();

    }
}
