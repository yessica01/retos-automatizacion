package co.com.bancolombia.certification.utest.exceptions;

public class LecturaArchivoException extends RuntimeException {
    public static final String FORMATO_MENSAJE_ERROR_LECTURA = "Error al leer el archivo";

    public LecturaArchivoException(String mensaje, Exception causa) {
        super(mensaje, causa);
    }
}
