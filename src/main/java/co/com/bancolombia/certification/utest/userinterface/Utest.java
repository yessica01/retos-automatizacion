package co.com.bancolombia.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Utest {
	public static final Target ELEGIR_OPCION= Target.the("Campo de ingreso para busqueda en listas").locatedBy("//option[contains(text(),'{0}')]");	
	public static final Target BOTON_DE_REGISTRO = Target.the("Botón para ingresar a la pantalla de registro de un usuario").locatedBy("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a");
	public static final Target ENTRADA_DE_NOMBRE = Target.the("Campo de ingreso para el nombre").locatedBy("//input[@id='firstName']");
	public static final Target ENTRADA_DE_APELLIDO = Target.the("Campo de ingreso para el apellido").locatedBy("//input[@id='lastName']");
	public static final Target ENTRADA_DE_CORREO= Target.the("Campo de ingreso para el correo").locatedBy("//input[@id='email']");	
	public static final Target BOTON_CONTINUAR_A_LOCALIZACION = Target.the("Botón para ingresar a la pantalla de información de localización").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");
	public static final Target ENTRADA_DE_CIUDAD= Target.the("Campo de ingreso para la ciudad").locatedBy("//input[@id='city']");	
	public static final Target LISTA_DE_CIUDADES= Target.the("Selección de ciudad en la lista").locatedBy("//*[contains(text(),'{0}')]");	
	public static final Target ENTRADA_DE_CODIGO_POSTAL= Target.the("Campo de ingreso para el código postal").locatedBy("//input[@id='zip']");	
	
}
