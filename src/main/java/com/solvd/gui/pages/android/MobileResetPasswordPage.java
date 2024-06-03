package com.solvd.gui.pages.android;

import com.solvd.gui.pages.common.ResetPasswordPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ResetPasswordPageBase.class)
public class MobileResetPasswordPage extends ResetPasswordPageBase {

    private static final Logger logger = LoggerFactory.getLogger(MobileResetPasswordPage.class);

    public MobileResetPasswordPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.TESTDATA.get("URL.login"));
        logger.info("ResetPasswordPage loaded");
    }

}