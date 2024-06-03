package com.solvd;

import com.solvd.gui.pages.common.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public abstract class BaseWebTest implements IAbstractTest {

    private static final Logger logger = LoggerFactory.getLogger(BaseWebTest.class);

    protected String email;

    protected String password;

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String browser) {
        email = R.CONFIG.get("USER.email");
        password = R.CONFIG.get("USER.password");

        logger.info("Browser: " + browser);
        R.CONFIG.put("capabilities.browserName", browser);
    }

    @AfterClass
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
