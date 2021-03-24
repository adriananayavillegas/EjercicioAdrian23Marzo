package co.com.dafiti.conf;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetTheStage {//Setear la sesión

    @Before  //basado en Cucumber
    public void setTheStage(){

        OnStage.setTheStage(new OnlineCast());//Clase que ayuda a realziar instanciamiento, y seteamos nueva instamncia
    }
}
