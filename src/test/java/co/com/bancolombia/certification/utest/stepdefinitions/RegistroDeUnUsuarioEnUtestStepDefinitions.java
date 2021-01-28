package co.com.bancolombia.certification.utest.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.utest.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.utest.tasks.RegistrarInformacionDeLocalizacion;
import co.com.bancolombia.certification.utest.tasks.RegistrarInformacionPersonal;
import co.com.bancolombia.certification.utest.userinterface.PaginaPrincipalDeUtest;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroDeUnUsuarioEnUtestStepDefinitions {
	@Managed(driver = "chrome")
	private WebDriver herBrowser;

	private Actor yessica = Actor.named("yessica");


	private PaginaPrincipalDeUtest googleHomePage;
	@Before
	public void setUp() {
		yessica.can(BrowseTheWeb.with(herBrowser));
		herBrowser.manage().window().maximize(); 
	}

	
	@Dado("^que yessica ingresa a la pagina principal de utest$")
	public void queYessicaIngresaALaPaginaPrincipalDeUtest() {
		yessica.wasAbleTo(OpenTheBrowser.on(googleHomePage));
	}


	@Cuando("^realiza el proceso de registro para un usuario nuevo$")
	public void completaElFormularioConLaInformacionCorrespondienteASuRegistro() {
		yessica.attemptsTo(RegistrarInformacionPersonal.enLaPagina(),
						   RegistrarInformacionDeLocalizacion.enLaPagina());
	}

	@Entonces("^deberia ver su registro fue exitoso$")
	public void deberiaVerSuRegistroFueExitoso() {
	   
	}

	@Cuando("^completa el primero formulario con la informacion personal$")
	public void completaElPrimeroFormularioConLaInformacionPersonal(DataTable arg1) {

	}

}
