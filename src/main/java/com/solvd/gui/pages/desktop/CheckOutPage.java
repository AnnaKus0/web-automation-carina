package com.solvd.gui.pages.desktop;

import com.solvd.gui.pages.common.CheckOutPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CheckOutPageBase.class)
public class CheckOutPage extends CheckOutPageBase {

    private static final Logger logger = LoggerFactory.getLogger(CheckOutPage.class);

    public CheckOutPage(WebDriver driver) {
        super(driver);
        setPageURL(R.TESTDATA.get("URL.checkout"));
        logger.info("CheckOutPage loaded");
    }

}
