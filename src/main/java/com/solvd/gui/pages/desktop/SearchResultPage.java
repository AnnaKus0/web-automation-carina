package com.solvd.gui.pages.desktop;

import com.solvd.gui.pages.common.SearchResultPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SearchResultPageBase.class)
public class SearchResultPage extends SearchResultPageBase {

    private static final Logger logger = LoggerFactory.getLogger(SearchResultPage.class);

    public SearchResultPage(WebDriver driver) {
        super(driver);
        setPageURL(R.TESTDATA.get("URL.login"));
        logger.info("SearchResultPage loaded");
    }

}
