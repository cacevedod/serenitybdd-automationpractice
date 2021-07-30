package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static co.com.devco.userinterfaces.AutomationPracticeHomePage.AUTOMATION_PRACTICE_HOME_PAGE;
import static co.com.devco.userinterfaces.AutomationPracticeHomePage.CAMPO_BUSQUEDA_PRINCIPAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarEnElPrincipal implements Task {
    private String palabra;

    public BuscarEnElPrincipal(String palabra) {
        this.palabra = palabra;
    }

    public static Performable sinFiltro(String palabra) {
        return instrumented(BuscarEnElPrincipal.class, palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(AUTOMATION_PRACTICE_HOME_PAGE),
                Enter.theValue(palabra).into(CAMPO_BUSQUEDA_PRINCIPAL).thenHit(Keys.ENTER)
        );
    }
}
