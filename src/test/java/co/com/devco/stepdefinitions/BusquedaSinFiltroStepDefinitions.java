package co.com.devco.stepdefinitions;

import co.com.devco.tasks.BuscarEnElPrincipal;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.AutomationPracticeResultPage.RESULTADOS_BUSQUEDA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BusquedaSinFiltroStepDefinitions {


    @Cuando("un {string} busca {string} en automationpractice")
    public void buscoSummerAutomationpractice(String nombreActor, String palabra) {
        theActorCalled(nombreActor).attemptsTo(
                BuscarEnElPrincipal.sinFiltro(palabra)
        );
    }

    @Entonces("debe ver {int} resultados")
    public void verResultados(Integer cantidadResultadosEsperados) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheSetOf(RESULTADOS_BUSQUEDA).hasSize(cantidadResultadosEsperados)
        );
    }

}
