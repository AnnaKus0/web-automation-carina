package com.solvd.gui.components.sidemenu;

import com.solvd.gui.pages.common.CartPageBase;
import com.solvd.gui.pages.common.CatalogPageBase;
import com.solvd.gui.pages.desktop.CatalogPage;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class SideMenu extends SideMenuBase implements ICustomTypePageFactory {

    private static final Logger logger = LoggerFactory.getLogger(SideMenu.class);

    @FindBy(xpath = "//ul[@id='main-menu']//li")
    private List<ExtendedWebElement> sidebarButtons;

    public SideMenu(WebDriver driver) {
        super(driver);
    }

    public SideMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CatalogPageBase clickMenuButtonByName(String buttonName) {
        sidebarButtons.stream()
                .filter(button -> button.getText().equalsIgnoreCase(buttonName))
                .findFirst()
                .ifPresent(ExtendedWebElement::click);

        return initPage(driver, CatalogPageBase.class);
    }
}
