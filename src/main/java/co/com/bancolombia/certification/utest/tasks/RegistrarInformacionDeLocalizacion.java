package co.com.bancolombia.certification.utest.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.bancolombia.certification.utest.model.InformacionParaRegistro;
import co.com.bancolombia.certification.utest.persistencia.DaoInformacionParaRegistro;
import co.com.bancolombia.certification.utest.persistencia.DaoInformacionParaRegistroImpl;
import co.com.bancolombia.certification.utest.userinterface.Utest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class RegistrarInformacionDeLocalizacion implements Task{

	private InformacionParaRegistro informacionParaRegistro;
	Target botonDeRegistro;
    private static final String ARCHIVO = "datos_para_registro_en_utest.json";


	public RegistrarInformacionDeLocalizacion() {
		
		DaoInformacionParaRegistro dao = new DaoInformacionParaRegistroImpl(ARCHIVO);
        this.informacionParaRegistro = dao.getInformacionParaRegistro();
	}
	
	@Step("{0} se dirige al apartado de registro y llena e formulario correspondiente") 
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
		
				WaitUntil.the(Utest.BOTON_CONTINUAR_A_LOCALIZACION, isEnabled()),	
				Click.on(Utest.BOTON_CONTINUAR_A_LOCALIZACION));
		actor.attemptsTo(
				WaitUntil.the(Utest.ENTRADA_DE_CIUDAD, isEnabled()),	
				Enter.theValue(informacionParaRegistro.getCiudad()).into(Utest.ENTRADA_DE_CIUDAD),
				Click.on(Utest.LISTA_DE_CIUDADES.of("Medellin, Antioquia, Colombia")),
				Enter.theValue(informacionParaRegistro.getCodigoPostal()).into(Utest.ENTRADA_DE_CODIGO_POSTAL));

				
	}

	public static RegistrarInformacionDeLocalizacion enLaPagina() {	
		return instrumented(RegistrarInformacionDeLocalizacion.class);
		
	}
}
