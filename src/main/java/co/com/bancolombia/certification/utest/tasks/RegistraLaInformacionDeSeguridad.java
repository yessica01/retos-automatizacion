package co.com.bancolombia.certification.utest.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.bancolombia.certification.utest.userinterface.RegistroUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegistraLaInformacionDeSeguridad implements Task{
	
	public RegistraLaInformacionDeSeguridad() {}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		WaitUntil.the(RegistroUtest.BOTON_CONTRASENA, isEnabled());
		actor.attemptsTo(Click.on(RegistroUtest.BOTON_CONTRASENA),
						Enter.theValue("Yrlc678*.gt6.").into(RegistroUtest.CONTRASENA),
						Enter.theValue("Yrlc678*.gt6.").into(RegistroUtest.CONFIRMAR_CONTRASENA));			
	
	
		actor.attemptsTo(Click.on(RegistroUtest.ACEPTAR_TERMINOS));
		actor.attemptsTo(Click.on(RegistroUtest.ACEPTAR_TERMINOS_SEGURIDAD));
	}

	
	public static RegistraLaInformacionDeSeguridad enLaPagina() {
		return instrumented(RegistraLaInformacionDeSeguridad.class);
		
	}

}