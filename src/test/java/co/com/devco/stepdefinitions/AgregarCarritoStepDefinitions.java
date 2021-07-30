package co.com.devco.stepdefinitions;

import co.com.devco.tasks.AgregarAlCarrito;
import co.com.devco.tasks.FiltrarBusqueda;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarCarritoStepDefinitions {


    @Dado("que un {string} filtra {string}")
    public void queUnFiltra(String nombreActor, String filtro) {
        theActorCalled(nombreActor).attemptsTo(
                FiltrarBusqueda.por(filtro)
        );
    }

    @Cuando("agrega el primer elemento al carrito")
    public void agregaElPrimerElementoAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.primerElemento()
        );
    }

    @Entonces("debe ver el elemento en el carrito")
    public void debeVerElElementoEnElCarrito() {
        Ensure.that(ELEMENTO_EN_EL_CARRITO).equals(theActorInTheSpotlight().recall("nombrePrimerElemento"));
    }

}
