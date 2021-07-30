package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static co.com.devco.userinterfaces.AutomationPracticeHomePage.AUTOMATION_PRACTICE_HOME_PAGE;
import static co.com.devco.userinterfaces.AutomationPracticeHomePage.CAMPO_BUSQUEDA_PRINCIPAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarBusqueda implements Task {
    private String filtro;

    public FiltrarBusqueda(String filtro) {
        this.filtro = filtro;
    }

    public static Performable por(String filtro) {
        return instrumented(FiltrarBusqueda.class, filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(AUTOMATION_PRACTICE_HOME_PAGE),
                MoveMouse.to(MENU_PRINCIPAL),
                Click.on(SUB_MENU_TIPO_1)
        );
    }
}
