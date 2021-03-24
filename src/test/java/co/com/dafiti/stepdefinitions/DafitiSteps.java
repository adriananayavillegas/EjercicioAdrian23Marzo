package co.com.dafiti.stepdefinitions;

import co.com.dafiti.navigation.OpenBrowser;
import co.com.dafiti.task.SearchItem;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class DafitiSteps {
    //private ItemModel item;

    @Given("^que el usuario (.*) acceda a la pagina principal$")
    public void accessToApp(String name){
        theActorCalled(name).
                wasAbleTo(
                        OpenBrowser.inPage()
                );
    }

    @When("^el agrega el item (.*) al carro de compras$")
    public void addItems(String item) {
        theActorInTheSpotlight()
                .wasAbleTo(
                        SearchItem.toCart(item)
                );

    }

    @Then("^el puede realizar la compra del articulo$")
    public void payItems() {


    }


}
