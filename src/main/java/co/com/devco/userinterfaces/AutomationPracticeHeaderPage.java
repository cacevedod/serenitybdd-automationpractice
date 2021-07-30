package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationPracticeHeaderPage {
	public static final Target PRIMER_ELEMENTO_FILTRADO = Target.the("elemento del menu principal").located(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='PARAMETRO']"));
	public static final Target TMP = Target.the("Resultados de la busqueda").located(By.xpath("//div[@id='center_column']/ul"));
}
