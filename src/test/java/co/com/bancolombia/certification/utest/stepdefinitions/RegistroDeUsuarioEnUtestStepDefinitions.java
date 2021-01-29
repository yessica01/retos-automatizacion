package co.com.bancolombia.certification.utest.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.utest.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.utest.tasks.RegistraLaInformacionDeDispositivos;
import co.com.bancolombia.certification.utest.tasks.RegistraLaInformacionDeLocalizacion;
import co.com.bancolombia.certification.utest.tasks.RegistraLaInformacionPersonal;
import co.com.bancolombia.certification.utest.userinterface.PaginaPrincipalDeUtest;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent();
import co.com.bancolombia.certification.utest.userinterface.RegistroUtest;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroDeUsuarioEnUtestStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver herBrowser;

	private Actor yessica = Actor.named("yessica");


	private PaginaPrincipalDeUtest homePage;
	@Before
	public void setUp() {
		yessica.can(BrowseTheWeb.with(herBrowser));
		herBrowser.manage().window().maximize(); 
	}


	@Dado("^que yessica desea registrarse en utest$")
	public void queYessicaDeseaRegistrarseEnUtest() {
			yessica.wasAbleTo(OpenTheBrowser.on(homePage));
	}


	@Cuando("^realiza el registro de la informacion en el formulario$")
	public void realizaElRegistroDeLaInformacionEnElFormulario() {
		yessica.attemptsTo(RegistraLaInformacionPersonal.enLaPagina(),
				           RegistraLaInformacionDeLocalizacion.enLaPagina(),
				           RegistraLaInformacionDeDispositivos.enLaPagina());
	}

	@Entonces("^debiera ver la confirmacion de registro exitoso$")
	public void debieraVerLaConfirmacionDeRegistroExitoso() {

	}

}
