package co.com.bancolombia.certification.utest.util;

import java.io.File;

public class LectorArchivoBuilder {

    private static final String LLAVE_DE_CONTEXTO = "context";
    private static final String CONTEXTO_POR_DEFECTO = "chrome";
    private final String contexto;

    public LectorArchivoBuilder() {
        contexto = "".equals(System.getProperty(LLAVE_DE_CONTEXTO)) ||
                System.getProperty(LLAVE_DE_CONTEXTO) == null ? CONTEXTO_POR_DEFECTO :
                System.getProperty(LLAVE_DE_CONTEXTO);
    }

    public static LectorArchivoBuilder leerUnArchivo() {
        return new LectorArchivoBuilder();
    }


    public File paraFormatoJson(String nombreDelArchivo) {
        String formatoJson = "datadriven" +
                File.separator + contexto + File.separator + "json"
                + File.separator + "%s";
        return new LectorArchivo().
                deTipo(String.format(formatoJson, nombreDelArchivo));
    }

 
}
