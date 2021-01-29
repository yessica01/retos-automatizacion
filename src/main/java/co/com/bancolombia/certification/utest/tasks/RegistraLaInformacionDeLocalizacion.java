package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.userinterface.RegistroUtest;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegistraLaInformacionDeLocalizacion implements Task{
	
	public RegistraLaInformacionDeLocalizacion() {}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		WaitUntil.the(RegistroUtest.BOTON_LOCALIZACION, isEnabled());
		actor.attemptsTo(Click.on(RegistroUtest.BOTON_LOCALIZACION));
		actor.attemptsTo(Enter.theValue("Medellín").into(RegistroUtest.CIUDAD),
						 Click.on(RegistroUtest.LISTA.of("Medellin, Antioquia, Colombia")),
				         Enter.theValue("4553").into(RegistroUtest.CODIGO_POSTAL));
			            
	}
	
	public static RegistraLaInformacionDeLocalizacion enLaPagina() {
		return instrumented(RegistraLaInformacionDeLocalizacion.class);
		
	}

}