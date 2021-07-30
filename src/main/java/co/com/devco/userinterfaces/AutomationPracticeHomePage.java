package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationPracticeHomePage {
	public static final String AUTOMATION_PRACTICE_HOME_PAGE = "http://automationpractice.com/index.php";
	public static final Target CAMPO_BUSQUEDA_PRINCIPAL = Target.the("Campo de busqueda Principal").located(By.id("search_query_top"));
}
