package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.userinterface.RegistroUtest;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegistraLaInformacionPersonal implements Task{
	
	public RegistraLaInformacionPersonal() {}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		WaitUntil.the(RegistroUtest.BOTON_REGISTRO, isEnabled());
		actor.attemptsTo(Click.on(RegistroUtest.BOTON_REGISTRO));
		actor.attemptsTo(Enter.theValue("Yessica").into(RegistroUtest.NOMBRE),
				         Enter.theValue("Rodriguez").into(RegistroUtest.APELLIDO),
			             Enter.theValue("yarodriguez212@gmail.com").into(RegistroUtest.CORREO));
		
		actor.attemptsTo(Click.on(RegistroUtest.ELEGIR_OPCION.of("January")),
				         Click.on(RegistroUtest.ELEGIR_OPCION.of("10")),
					     Click.on(RegistroUtest.ELEGIR_OPCION.of("1996")));
	}
	
	public static RegistraLaInformacionPersonal enLaPagina() {
		return instrumented(RegistraLaInformacionPersonal.class);
		
	}

}