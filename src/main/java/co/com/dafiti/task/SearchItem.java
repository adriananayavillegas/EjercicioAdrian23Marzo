package co.com.dafiti.task;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

import static co.com.dafiti.ui.HomePage.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchItem implements Task {

    private final String item;

    public SearchItem(String item) {this.item = item;}

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(item).into(INPUT_SEARCH),
                Hit.the(Keys.ENTER).into(INPUT_SEARCH)
        );
    }

    public static Performable toCart(String item){
        return  instrumented(SearchItem.class, item);
    }

}
