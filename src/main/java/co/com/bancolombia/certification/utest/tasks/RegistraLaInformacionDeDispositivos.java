package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.userinterface.RegistroUtest;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegistraLaInformacionDeDispositivos implements Task{
	
	public RegistraLaInformacionDeDispositivos() {}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		WaitUntil.the(RegistroUtest.BOTON_DISPOSITIVOS, isEnabled());
		actor.attemptsTo(Click.on(RegistroUtest.BOTON_DISPOSITIVOS),
				
				
						Click.on(RegistroUtest.MOVIL),
						Click.on(RegistroUtest.LISTA.of("Alcatel")),
						
						Click.on(RegistroUtest.MODELO_DISPOSTIVO),
						Click.on(RegistroUtest.LISTA.of("MD01")),
								
						Click.on(RegistroUtest.SISTEMA_OPERATIVO),
					    Click.on(RegistroUtest.LISTA.of("Android 2.0")));
	}
	
	public static RegistraLaInformacionDeDispositivos enLaPagina() {
		return instrumented(RegistraLaInformacionDeDispositivos.class);
		
	}

}