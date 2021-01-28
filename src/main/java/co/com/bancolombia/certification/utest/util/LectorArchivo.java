package co.com.bancolombia.certification.utest.util;

import  co.com.bancolombia.certification.utest.exceptions.ArchivoLoteNoEncontradoException;

import java.io.File;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import co.com.bancolombia.certification.utest.exceptions.ArchivoLoteNoEncontradoException;



public class LectorArchivo {

    private static final String MENSAJE_DE_ERROR = "Nombre de archivo es nullo o vacio";
    private static final String FORMATO_URL_BASE = "datadriven" + File.separator+"%s";
    private static final String FORMATO_MENSAJE_ARCHIVO_NO_ENCONTRADO = "El archivo con nombre %s no fue encontrado";

    public static LectorArchivo crearLectorArchivo() {
        return new LectorArchivo();
    }

    // TODO //
    public File deTipo(String formatoArchivo) {
        validarNombreArchivo(formatoArchivo);
        String url = obtenerURL(formatoArchivo);
        File archivo = new File(url);
        validarArchivo(archivo, formatoArchivo);
        return archivo;
    }

    private String obtenerURL(String formatoArchivo) {
        try {
            return URLDecoder.decode(
                    getClass().getClassLoader().getResource(formatoArchivo).getFile()
                    , StandardCharsets.UTF_8.name());
        } catch (Exception e) {
            throw new ArchivoLoteNoEncontradoException(String.format(FORMATO_MENSAJE_ARCHIVO_NO_ENCONTRADO, formatoArchivo), e);
        }
    }
    // TODO IMPLEMENTANDO //

    public File leer(String nombreArchivo) {
        validarNombreArchivo(nombreArchivo);
        String url = getURL(nombreArchivo);
        File archivo = new File(url);
        validarArchivo(archivo, nombreArchivo);
        return archivo;
    }

    private String getURL(String nombreArchivo) {
        try {
            return URLDecoder.decode(
                    getClass().getClassLoader().getResource(String.format(FORMATO_URL_BASE, nombreArchivo)).getFile()
                    , StandardCharsets.UTF_8.name());
        } catch (Exception e) {
            throw new ArchivoLoteNoEncontradoException(String.format(FORMATO_MENSAJE_ARCHIVO_NO_ENCONTRADO, nombreArchivo), e);
        }
    }

    private void validarNombreArchivo(String nombreArchivo) {
        if (nombreArchivo == null || "".equals(nombreArchivo)) {
            throw new IllegalArgumentException(MENSAJE_DE_ERROR);
        }
    }

    private void validarArchivo(File archivo, String nombreArchivo) {
        if (archivo == null) {
            throw new ArchivoLoteNoEncontradoException(String.format(FORMATO_MENSAJE_ARCHIVO_NO_ENCONTRADO, nombreArchivo));
        }
    }
}
