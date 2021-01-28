package co.com.bancolombia.certification.utest.exceptions;

public class ArchivoLoteNoEncontradoException extends IllegalStateException {

    public ArchivoLoteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
    public ArchivoLoteNoEncontradoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
