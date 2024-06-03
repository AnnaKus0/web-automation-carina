package com.solvd.gui.components.header;

import com.solvd.gui.pages.common.CartPageBase;
import com.solvd.gui.pages.common.LoginPageBase;
import com.solvd.gui.pages.common.SignUpPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends HeaderBase {

//    @FindBy(id = "customer_login_link")
//    private ExtendedWebElement logInLink;
//
//    @FindBy(id = "customer_register_link")
//    private ExtendedWebElement signupLink;

    @FindBy(xpath = "//a[contains(@href, '/account') and not(contains(@href, 'logout'))]")
    private ExtendedWebElement myAccountLink;

    @FindBy(id = "customer_logout_link")
    private ExtendedWebElement logOutLink;

    @FindBy(xpath = "//a[@class='checkout' and @href='/cart']")
    private ExtendedWebElement checkOutLink;

    public Header(WebDriver driver) {
        super(driver);
    }

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

//    public LoginPageBase clickLoginLink() {
//        logInLink.click();
//        return initPage(driver, LoginPageBase.class);
//    }
//
//    public SignUpPageBase clickSignUpLink() {
//        signupLink.click();
//        return initPage(driver, SignUpPageBase.class);
//    }

    public CartPageBase clickCheckOutLink() {
        checkOutLink.click();
        return initPage(driver, CartPageBase.class);
    }

    public boolean isMyAccountLinkVisible() {
        return myAccountLink.isVisible();
    }

    public boolean isLogOutLinkVisible() {
        return logOutLink.isVisible();
    }

}
