package co.com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ItemsResultsPage {

    public static final Target LBL_ITEM =
            Target.the("label item")
                    .locatedBy("//span[contains(text(),'{0}') and contains(@class,'sel-search-input')]");

}
