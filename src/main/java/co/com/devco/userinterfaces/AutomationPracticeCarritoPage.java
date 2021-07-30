package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationPracticeCarritoPage {
	public static final Target RESULTADOS_BUSQUEDA = Target.the("Resultados de la busqueda").located(By.xpath("//div[@id='center_column']/ul/li"));
	public static final Target TMP = Target.the("Resultados de la busqueda").located(By.xpath("//div[@id='center_column']/ul"));
}
