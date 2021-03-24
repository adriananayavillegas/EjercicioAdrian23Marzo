package co.com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target INPUT_SEARCH =
            Target.the("input search item").located(By.id("searchInput"));

    public static final Target BTN_CART =
            Target.the("button go to cart").located(By.id("ruben"));

}
