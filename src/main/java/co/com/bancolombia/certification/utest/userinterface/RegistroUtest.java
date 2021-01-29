package co.com.bancolombia.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUtest {

	public static final Target BOTON_REGISTRO = Target.the("").locatedBy("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a");
	public static final Target NOMBRE = Target.the("").locatedBy("//input[@id='firstName']");
	public static final Target APELLIDO = Target.the("").locatedBy("//input[@id='lastName']");
	public static final Target CORREO = Target.the("").locatedBy("//input[@id='email']");
	public static final Target ELEGIR_OPCION = Target.the("").locatedBy("//option[contains(text(),'{0}')]");
	public static final Target BOTON_LOCALIZACION = Target.the("").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");
	public static final Target CIUDAD = Target.the("").locatedBy("//*[@id='city']");
	public static final Target CODIGO_POSTAL = Target.the("").locatedBy("//*[@id='zip']");
	public static final Target BOTON_DISPOSITIVOS = Target.the("").locatedBy("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/span");
	public static final Target COMPUTADOR = Target.the("").locatedBy("//*[@id='web-device']/div[1]/div[2]/div/input[1]");
	public static final Target VERSION = Target.the("").locatedBy("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]");
	public static final Target LENGUAJE = Target.the("").locatedBy("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span/span[2]");
	public static final Target MOVIL = Target.the("").locatedBy("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span");
	public static final Target MODELO_DISPOSTIVO = Target.the("").locatedBy("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span");
	public static final Target SISTEMA_OPERATIVO = Target.the("").locatedBy("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span");
	public static final Target LISTA = Target.the("").locatedBy("//*[contains(text(),'{0}')]");
	public static final Target BOTON_CONTRASENA = Target.the("").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span");
	public static final Target CONTRASENA = Target.the("").locatedBy("//*[@id='password']");
	public static final Target CONFIRMAR_CONTRASENA = Target.the("").locatedBy("//*[@id='confirmPassword']");
	public static final Target ACEPTAR_TERMINOS = Target.the("").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]");
	public static final Target ACEPTAR_TERMINOS_SEGURIDAD = Target.the("").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]");

}
