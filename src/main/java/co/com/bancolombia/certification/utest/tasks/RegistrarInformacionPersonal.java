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

public class RegistrarInformacionPersonal implements Task{

	private InformacionParaRegistro informacionParaRegistro;
	Target botonDeRegistro;
    private static final String ARCHIVO = "datos_para_registro_en_utest.json";


	public RegistrarInformacionPersonal() {
		
		DaoInformacionParaRegistro dao = new DaoInformacionParaRegistroImpl(ARCHIVO);
        this.informacionParaRegistro = dao.getInformacionParaRegistro();
	}
	
	@Step("{0} se dirige al apartado de registro y llena e formulario correspondiente") 
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
		
				WaitUntil.the(Utest.BOTON_DE_REGISTRO, isEnabled()),	
				Click.on(Utest.BOTON_DE_REGISTRO));
		actor.attemptsTo(
				WaitUntil.the(Utest.ENTRADA_DE_NOMBRE, isEnabled()),	
				Enter.theValue(informacionParaRegistro.getNombre()).into(Utest.ENTRADA_DE_NOMBRE),
				Enter.theValue(informacionParaRegistro.getApellido()).into(Utest.ENTRADA_DE_APELLIDO),
				Enter.theValue(informacionParaRegistro.getCorreo()).into(Utest.ENTRADA_DE_CORREO));
				
		actor.attemptsTo(
				Click.on(Utest.ELEGIR_OPCION.of(informacionParaRegistro.getMes())),
				Click.on(Utest.ELEGIR_OPCION.of(informacionParaRegistro.getDia())),
				Click.on(Utest.ELEGIR_OPCION.of(informacionParaRegistro.getAno())));
	}

	public static RegistrarInformacionPersonal enLaPagina() {	
		return instrumented(RegistrarInformacionPersonal.class);
		
	}
}
