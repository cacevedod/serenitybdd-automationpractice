package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.AutomationPracticeHomePage.AUTOMATION_PRACTICE_HOME_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarAlCarrito implements Task {

    public AgregarAlCarrito() {
    }

    public static Performable primerElemento() {
        return instrumented(AgregarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("nombrePrimerElemento", buscarNombrePrimerElemento(actor));
        actor.attemptsTo(
                MoveMouse.to(PRIMER_ELEMENTO_FILTRADO),
                Click.on(AGREGAR_AL_CARRITO_POR_ELEMENTO)
        );
    }

    private String buscarNombrePrimerElemento(Actor actor){
        return "TMP";
    }
}
